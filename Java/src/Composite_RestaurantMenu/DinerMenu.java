package Composite_RestaurantMenu;

public class DinerMenu extends Menu {
    private int numberOfItems = 0;

    public DinerMenu(String name, String description) {
        super(name, description);
        addItem("Vegetarian BLT", "(Faklin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        add(new MenuItem(name, description, vegetarian, price));
    }
}
