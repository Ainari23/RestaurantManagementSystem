//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws RestaurantException{
        System.out.print("Hello and welcome to you restaurant System!");
        //Fonctionnalités :
        Menu menu = new Menu();//Gere un menu vide
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository);//Gestion des employés

        //Create a few dishe's category
        DishCategory entree = new DishCategory("Entrée");
        DishCategory plat = new DishCategory("Plat");
        DishCategory dessert = new DishCategory("Dessert");

        //Add a few dishes on the menu.
        Dish dish1 = null;
        try {
             dish1 = new Dish("Salade César", 12.50, "Salade avec poulet, croutons et sauce", entree);
        } catch (RestaurantException e) {
            System.out.println("Erreur lors de la création du plat : " + e.getMessage());
        }
        Dish dish2 = null;
        try {
            dish2 = new Dish("Burger Classique", 15.00, "Burger avec viande de boeuf, fromage, salade", plat);
        } catch (RestaurantException e) {
            System.out.println("Erreur lors de la création du plat : " + e.getMessage());
        }

        Dish dish3 = null;
        try {
            dish3 = new Dish("Tiramisu", 7.50, "Dessert à base de mascarpone et de café", dessert);
        } catch (RestaurantException e) {
            System.out.println("Erreur lors de la création du plat : " + e.getMessage());
        }

        // Ajoute les plats au menu, mais vérifie si dish1 est null pour éviter une exception
        if (dish1 != null) {
            menu.addDish(dish1);
        }
        if (dish2 != null) {
            menu.addDish(dish2);
        }
        if (dish3 != null) {
            menu.addDish(dish3);
        }

        //Print dishes and menu
        System.out.println(("Menu du jour : "));
        for (Dish dish : menu.getDishes()){
            System.out.println("-"+dish);
        }
        if (dish1 != null) {
            menu.addDish(dish1);
        }
        if (dish2 != null) {
            menu.addDish(dish2);
        }
        if (dish3 != null) {
            menu.addDish(dish3);
        }

        try {
            Dish orderedDish = menu.getDishByName("Pizza");
            System.out.println("Dishes found : " + orderedDish);
        } catch (Menu.DishNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }


        //Create employees Role
        RoleEmployee chefRole = new RoleEmployee("Chef");
        RoleEmployee waiterRole = new RoleEmployee("Waiter");

        Employee employee1 = new Employee("Marc", chefRole, 3000);
        Employee employee2 = new Employee("Claire", waiterRole, 1500);
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);

        //Updating an employee's role
        employeeManager.updateRole(employee1, "Senior Chef");


        //Print employee
        System.out.println("\nEmployees List : ");
        for (Employee employee : employeeRepository.getAllEmployee()){
            System.out.println("-"+employee.getName()+"-"+employee.getRoleEmployee()+"\n");
        }

        // Create a customer
        Customer customer = new Customer(1, "John Doe");

        // Add a reservation for the customer first
        Reservation reservation = new Reservation(4, "2025-02-10 19:00");
        customer.addReservation(reservation);  // Ajoute la réservation avant de passer la commande


        // Create an order for the customer
        try {
            // Create an order with status "EN COURS" (In Progress)
            Order order1 = new Order("EN COURS");  // Order status
            // Add a dish to the order
            order1.addDish(dish1);  // Add the "Salad Caesar" dish
            customer.placeOrder(order1);  // Place the order
            order1.setInProgress();      // Set order status to "In Progress"
            order1.setReady();           // Set order status to "Ready"
            order1.setServed();          // Set order status to "Served"
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create another order for the customer
            Order order2 = new Order("EN COURS");  // Order status
            // Add a dish to the order
            order2.addDish(dish2);  // Add the "Classic Burger" dish
            customer.placeOrder(order2);  // Place the order
            order2.setInProgress();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create another order for the customer
            Order order3 = new Order("EN COURS");  // Order status
            // Add a dish to the order
            order3.addDish(dish3);  // Add the "Tiramisu" dish
            customer.placeOrder(order3);  // Place the order
            order3.setInProgress();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

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