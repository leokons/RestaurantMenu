package restaurant;

public class MenuItem {
    private final int menuId;
    private final String description;
    private final double price;
    private final MenuCategory category;
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

    public int getMenuId() {
        return menuId;
    }

    public MenuCategory getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return menuId + " " + description + " " + price + " " + category + " "
                + (isNew ? "new menu item" : "old menu item");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) o;

        return this.getCategory() == menuItem.getCategory() && this.getDescription() == menuItem.getDescription()
                && this.getMenuId() == menuItem.getMenuId() && this.getPrice() == menuItem.getPrice();
    }


}
