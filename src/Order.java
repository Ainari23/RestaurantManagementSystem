import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextId = 1;
    private int idCommand;
    private List<Dish> orderDishes;
    private OrderStatus status;

    public Order(String status){
        this.idCommand = nextId++;
        this.orderDishes = new ArrayList<>();
        this.status = OrderStatus.PENDING;
    }

    public int getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(int idCommand) {
        this.idCommand = idCommand;
    }

    public List<Dish> getOrderDishes() {
        return orderDishes;
    }

    public void setOrderDishes(List<Dish> orderDishes) {
        this.orderDishes = orderDishes;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    //Method to change status to IN_PROGRESS
    public void setInProgress(){
        if (this.status == OrderStatus.PENDING){
            this.status = OrderStatus.IN_PROGRESS;
            System.out.println("Order " + idCommand + " is now being prepared.");
        }else {
            System.out.println("Cannot change to IN_PROGRESS. Current status: " + this.status);
        }
    }
    // Method to change status to READY
    public void setReady() {
        if (this.status == OrderStatus.IN_PROGRESS) {
            this.status = OrderStatus.READY;
            System.out.println("Order " + idCommand + " is ready to be served.");
        } else {
            System.out.println("Cannot change to READY. Current status: " + this.status);
        }
    }

    // Method to change status to SERVED
    public void setServed() {
        if (this.status == OrderStatus.READY) {
            this.status = OrderStatus.SERVED;
            System.out.println("Order " + idCommand + " has been served.");
        } else {
            System.out.println("Cannot change to SERVED. Current status: " + this.status);
        }
    }

    public void addDish(Dish dish) throws RestaurantException{
        if (dish == null){
            throw new RestaurantException("Dish cannot be null");
        }
        orderDishes.add(dish);
    }


    @Override
    public String toString() {
        StringBuilder dishesList = new StringBuilder();
        for (Dish dish : orderDishes) {
            if (dish != null) {  // Vérifie si le plat n'est pas null
                dishesList.append(dish.toString()).append(", ");
            } else {
                dishesList.append("Dish unfound ");  // Optional: message indicating that a dish is null
            }
        }
        return "Order{" +
                "idCommand=" + idCommand +
                ", orderDishes=" + dishesList.toString() +
                ", status='" + status + '\'' +
                '}';
    }

}
