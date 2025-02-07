import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu(){
        this.dishes = new ArrayList<>();
    }
    //Add Dishes
    public void addDish(Dish dish){
        this.dishes.add(dish);
    }
    public List<Dish> getDishes(){
        return dishes;
    }
    public class DishNotFoundException extends Exception{
        public DishNotFoundException(String message){
            super(message);
        }
    }
    //Method to search for a dish by name
    public Dish getDishByName(String name) throws DishNotFoundException {
        for (Dish dish : dishes) {
            if (dish != null && dish.getName().equalsIgnoreCase(name)) {  // Vérifie si le plat n'est pas null
                return dish;
            }
        }
        throw new DishNotFoundException("Plat non trouvé : " + name);
    }

}

