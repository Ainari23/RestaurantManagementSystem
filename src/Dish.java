import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private double price;
    private String description;
    private DishCategory dishCategories;//Catégorie associé

    public Dish(String name, double price, String description, DishCategory dishCategories) throws RestaurantException{
        if (name == null || name.isEmpty()){
            throw new RestaurantException("Dishes name canot be blank");
        }
        if (price <=0){
            throw new RestaurantException("Price must be greater than zero");
        }
        if (description== null || description.isEmpty()){
            throw new RestaurantException("Description cannot be blank");
        }
        if (dishCategories == null){
            throw new RestaurantException("Categories is required");
        }
        this.name=name;
        this.price = price;
        this.description = description;
        this.dishCategories = dishCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DishCategory getDishCategories() {
        return dishCategories;
    }

    public void setDishCategories(DishCategory dishCategories) {
        this.dishCategories = dishCategories;
    }
    public void addDish(Dish dish){
        dish.addDish(dish);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", dishCategories=" + dishCategories.getCategoryName().toUpperCase() +
                '}';
    }
}
