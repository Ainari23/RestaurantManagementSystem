//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome to you restaurant System!");
        //Fonctionnalités :
        Menu menu = new Menu();//Gere un menu vide
        EmployeeManager employeeManager = new EmployeeManager();//Gestion des employés

        //Create a few dishe's category
        DishCategory entree = new DishCategory("Entrée");
        DishCategory plat = new DishCategory("Plat");
        DishCategory dessert = new DishCategory("Dessert");

        //Add a few dishes on the menu.
        Dish dish1 = null;
        try {
             dish1 = new Dish("Salade César", -12.50, "Salade avec poulet, croutons et sauce", entree);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la création du plat : " + e.getMessage());
        }
        Dish dish2 = new Dish("Burger Classique", 15.00, "Burger avec viande de boeuf, fromage, salade", plat);
        Dish dish3 = new Dish("Tiramisu", 7.50, "Dessert à base de mascarpone et de café", dessert);

        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        //Print dishes and menu
        System.out.println(("Menu du jour : "));
        for (Dish dish : menu.getDishes()){
            System.out.println("-"+dish);
        }
        try {
            Dish orderedDish = menu.getDishByName("Pizza");
            System.out.println("Plat trouvé : " + orderedDish);
        } catch (Menu.DishNotFoundException e) {
            System.out.println("Erreur : " + e.getMessage());
        }


        //Create employee
        RoleEmployee chefRole = new RoleEmployee("Chef");
        RoleEmployee waiterRole = new RoleEmployee("Waiter");

        Employee chef = new Employee("Marc", chefRole, 3000);
        Employee waiter = new Employee("Claire", waiterRole, 1500);

        employeeManager.addEmployee(chef);
        employeeManager.addEmployee(waiter);

        //Print employee
        System.out.println("\nEmployees List :");
        for (Employee employee : employeeManager.getEmployees()){
            System.out.println("-"+employee);
        }
        //Create a customer
        Customer customer = new Customer(1, "John Doe");

        try {
            // Tentative de passer une commande sans réservation
            Order order = new Order(1, "EN COURS");
            customer.placeOrder(order);
        } catch (IllegalStateException e) {
            System.out.println("Erreur : " + e.getMessage());
        }


        //Add an order for the customer
        Order order1 = new Order(1, "En cours");
        order1.getOrderDishes().add(dish1);
        customer.addOrder(order1);

        //Add a reservation for a customer
        Reservation reservation = new Reservation(4, "2025-02-10 19:00");
        customer.addReservation(reservation);

        //Show details about the customer
        System.out.println("\n Information about the Client : ");
        System.out.println(customer);

        //View a customer's order history
        System.out.println("\n Customers Order : ");
        for (Order order : customer.getOrders()){
            System.out.println("-"+order);
        }
        //View customer reservations
        System.out.println("\nRéservations du client:");
        for (Reservation res : customer.getReservations()) {
            System.out.println(res);
        }

    }
}