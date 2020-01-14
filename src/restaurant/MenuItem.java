package restaurant;

public class MenuItem {
    private final int menuId;
    double price;
    private final String description;
    private String category;
    //= {"appetizer", "main course", "dessert"};
    private String ifNew;

    public MenuItem(String name, double price, String description, String category, String ifNew) {
        this.menuId=menuId;
        this.price=price;
        this.description=description;
        this.category=category;
        this.ifNew=ifNew;

    }

}
