package ua.kushnirenko.iterator.composite.waiter;

import ua.kushnirenko.iterator.composite.menu.Menu;


public interface Waiter {

    void addNewMenu(Menu menu);

    void printMenus();

    void printVeggieMenu();

}
