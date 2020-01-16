package restaurant;

public class MenuItem {
    private final int menuId;
    private final String description;
    private final double price;
    private final MenuCategory category;
    //= {"appetizer", "main course", "dessert"};
    private boolean isNew;

    public MenuItem(int menuId, String description, double price, MenuCategory category, boolean isNew) {
        this.menuId=menuId;
        this.description=description;
        this.price=price;
        this.category=category;
        this.isNew=isNew;
    }

    public MenuItem(int menuId, String description, double price, MenuCategory category) {
        this(menuId, description, price, category, false);
    }

    public MenuCategory getCategory() {
        return Category;
    }

}
