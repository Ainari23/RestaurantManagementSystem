import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idCommand;
    private List<Dish> orderDishes;
    private String status;

    public Order(int idCommand, String status){
        this.idCommand = idCommand;
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
