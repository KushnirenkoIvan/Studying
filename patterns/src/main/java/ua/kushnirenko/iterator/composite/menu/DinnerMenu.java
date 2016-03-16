package ua.kushnirenko.iterator.composite.menu;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.util.Iterator;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;

import java.util.ConcurrentModificationException;


public class DinnerMenu extends Menu {

    public static final int MENU_SIZE = 6;
    private int numberOfItems;
    private MenuComponent[] menuItems;

    public MenuComponent[] getMenuItems() {
        return menuItems;
    }

    public DinnerMenu() {
        type = "LUNCH";
        menuItems = new MenuItem[MENU_SIZE];
        modificationCount = 0;
        numberOfItems = 0;

        add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                true,
                3.29));
        add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));
    }

    @Override
    public void add(MenuComponent component) {
        menuItems[numberOfItems++] = component;
        modificationCount++;
    }

    @Override
    public Iterator iterator() {
        if (iterator == null) {
            iterator = new DinnerMenuIterator(getMenuItems(), modificationCount);
        }
        return iterator;
    }

    private class DinnerMenuIterator extends Iterator<MenuComponent> {

        private DinnerMenuIterator(MenuComponent[] menuItems, int modificationCount) {

            this.enumeration = new MenuComponent[DinnerMenu.this.numberOfItems];
            this.modificationCount = modificationCount;
            this.cursor = 0;

            for (int i = 0; i < DinnerMenu.this.numberOfItems; i++) {
                enumeration[i] = menuItems[i];
            }
        }

        @Override
        public boolean hasNext() {
            checkMutation();
            return cursor < enumeration.length;
        }

        @Override
        public MenuComponent next() {
            checkMutation();

            MenuComponent item = enumeration[cursor++];

            if (cursor == enumeration.length - 1) {
                DinnerMenu.this.iterator = null;
            }

            return item;
        }

        @Override
        public void checkMutation() throws ConcurrentModificationException {

            if (DinnerMenu.this.modificationCount != modificationCount) {
                DinnerMenu.this.iterator = null;
                throw new ConcurrentModificationException();
            }
        }
    }
}
