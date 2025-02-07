import java.util.List;

public class DishCategory {
    private String categoryName;

    public DishCategory(String categoryName){
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "DishCategory{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
