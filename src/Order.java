import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextId = 1;
    private int idCommand;
    private List<Dish> orderDishes;
    private String status;

    public Order(String status){
        this.idCommand = nextId++;
        this.orderDishes = new ArrayList<>();
        this.status = "EN COURS";
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
