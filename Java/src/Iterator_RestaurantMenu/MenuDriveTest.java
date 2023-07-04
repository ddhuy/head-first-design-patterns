package Iterator_RestaurantMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuDriveTest {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new DinerMenu());
        menuList.add(new CafeMenu());

        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
