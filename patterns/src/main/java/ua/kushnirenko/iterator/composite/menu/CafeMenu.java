package ua.kushnirenko.iterator.composite.menu;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;
import ua.kushnirenko.iterator.composite.util.Iterator;

import java.util.ConcurrentModificationException;
import java.util.HashSet;


public class CafeMenu extends Menu {

    private HashSet<MenuComponent> menuItems;

    public HashSet<MenuComponent> getMenuItems() {
        return menuItems;
    }

    public CafeMenu() {
        type = "DINNER";
        menuItems = new HashSet<>(3);
        modificationCount = 0;

        add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));
        add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.99));
        add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));
    }

    @Override
    public void add(MenuComponent component) {
        menuItems.add(component);
        modificationCount++;
    }

    @Override
    public Iterator iterator() {
        if (iterator == null) {
            iterator = new CafeMenuIterator(getMenuItems(), modificationCount);
        }
        return iterator;
    }

    private class CafeMenuIterator extends Iterator<MenuComponent> {

        public CafeMenuIterator(HashSet<MenuComponent> menu, int modificationCount) {
            cursor = 0;
            enumeration = new MenuComponent[menu.size()];
            this.modificationCount = modificationCount;

            int idx = 0;
            for (MenuComponent component : menu) {
                enumeration[idx++] = component;
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

            if (cursor == enumeration.length - 1) {
                CafeMenu.this.iterator = null;
            }

            return enumeration[cursor++];
        }

        @Override
        public void checkMutation() throws ConcurrentModificationException {

            if (modificationCount != CafeMenu.this.modificationCount) {
                throw new ConcurrentModificationException();
            }

        }
    }
}
