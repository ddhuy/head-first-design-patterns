package Composite_RestaurantMenu;

public class MenuDriveTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new DinerMenu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new CafeMenu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new DessertMenu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
