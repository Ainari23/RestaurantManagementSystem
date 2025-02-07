import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private double price;
    private String description;
    private DishCategory dishCategories;//Catégorie associé

    public Dish(String name, double price, String description, DishCategory dishCategories) throws IllegalArgumentException{
        this.name = name;
        if (price <=0){
            throw new IllegalArgumentException("Price must be greater than zero");
        }
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
