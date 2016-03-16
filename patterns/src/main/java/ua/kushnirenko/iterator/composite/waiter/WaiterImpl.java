package ua.kushnirenko.iterator.composite.waiter;

import ua.kushnirenko.iterator.composite.menu.Menu;
import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;
import ua.kushnirenko.iterator.composite.util.CompositeIterator;
import ua.kushnirenko.iterator.composite.util.Iterator;

import java.util.ArrayList;


public class WaiterImpl implements Waiter {

    private ArrayList<Menu> menusList;

    public ArrayList<Menu> getMenusList() {
        return menusList;
    }

    public void setMenusList(ArrayList<Menu> menusList) {
        this.menusList = menusList;
    }

    public WaiterImpl() {
        menusList = new ArrayList<>();
    }

    @Override
    public void addNewMenu(Menu menu) {
        menusList.add(menu);
    }

    @Override
    public void printMenus() {

        System.out.println("----- MENU -----\n");

        for (Menu menu : menusList) {
            Iterator<MenuComponent> iter = menu.iterator();

            StringBuilder sb = new StringBuilder("###################  "
                    + menu.getClass().getSimpleName() + ":" + menu.getType() + "  ##################\n");

            while (iter.hasNext()) {
                sb.append("\n" + iter.next().toPrint());
            }
            sb.append("\n*********************************************************\n");

            System.out.println(sb);
        }
    }

    @Override
    public void printVeggieMenu() {
        System.out.println("----- VEGGIE MENU -----\n");

        for (Menu menu : menusList) {

            CompositeIterator cIterator = new CompositeIterator(menu.iterator());

            StringBuilder sb = new StringBuilder("###################  "
                    + menu.getClass().getSimpleName() + ":" + menu.getType() + "  ##################\n");

            while (cIterator.hasNext()) {

                MenuComponent component = cIterator.next();

                if (component instanceof MenuItem && ((MenuItem) component).isVegetarian()) {
                    sb.append("\n" + component.toPrint());
                }

                sb.append("\n*********************************************************\n");
            }
            System.out.println(sb);
        }
    }
}
