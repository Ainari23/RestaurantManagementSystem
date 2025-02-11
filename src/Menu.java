import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu(){
        this.dishes = new ArrayList<>();
    }
    //Add Dishes
    public void addDish(Dish dish) throws RestaurantException{
        if (dish != null && !dishes.contains(dish)) {
            dishes.add(dish);
        }
    }
    public List<Dish> getDishes(){
        return dishes;
    }
    public class DishNotFoundException extends RestaurantException{
        public DishNotFoundException(String message){
            super(message);
        }
    }
    //Method to search for a dish by name
    public Dish getDishByName(String name) throws DishNotFoundException {
        for (Dish dish : dishes) {
            if (dish != null && dish.getName() != null && dish.getName() .equalsIgnoreCase(name)) {  // Vérifie si le plat n'est pas null
                return dish;
            }
        }
        throw new DishNotFoundException("Dish not found : " + name);
    }

}

