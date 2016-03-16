package ua.kushnirenko.iterator.composite;

import ua.kushnirenko.iterator.composite.menu.CafeMenu;
import ua.kushnirenko.iterator.composite.menu.DinnerMenu;
import ua.kushnirenko.iterator.composite.menu.Menu;
import ua.kushnirenko.iterator.composite.menu.PancakeHouseMenu;
import ua.kushnirenko.iterator.composite.waiter.WaiterImpl;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;
import ua.kushnirenko.iterator.composite.waiter.Waiter;


public class RunApp {

    public static void main(String[] args) {
        Waiter w = new WaiterImpl();

        Menu cafeMenu = new CafeMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();

        w.addNewMenu(cafeMenu);
        w.addNewMenu(pancakeHouseMenu);
        w.addNewMenu(dinnerMenu);

        MenuItem menuItem = new MenuItem("King's burger",
                "Burger on a whole wheat bun, lettuce, tomato, and meat",
                true,
                4.49);

        try {

            menuItem.add(cafeMenu);

        } catch (UnsupportedOperationException e) {

            System.out.println("You can't add any components to a leaf!");

        }

        dinnerMenu.add(menuItem);

        w.printMenus();
        w.printVeggieMenu();
    }
}
