package Iterator_RestaurantMenu;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menuList.iterator();
        System.out.println("MENU\n----");
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();

            System.out.println("\n" + menu.getName());
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(MenuIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
