package ua.kushnirenko.iterator.composite.menu;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.util.Iterator;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;


public class DesertMenu extends Menu {

    private LinkedList<MenuComponent> menuItems;

    public LinkedList<MenuComponent> getMenuItems() {
        return menuItems;
    }

    public DesertMenu() {
        type = "DESERT";
        menuItems = new LinkedList<>();
        modificationCount = 0;

        add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
    }

    @Override
    public void add(MenuComponent component) {
        menuItems.add(component);
        modificationCount++;
    }

    @Override
    public Iterator iterator() {
        if (iterator == null) {
            iterator = new DesertMenuIterator(getMenuItems(), modificationCount);
        }
        return iterator;
    }

    private class DesertMenuIterator extends Iterator<MenuComponent> {

        private DesertMenuIterator(LinkedList<MenuComponent> list, int modificationCount) {
            this.modificationCount = modificationCount;
            enumeration = new MenuComponent[DesertMenu.this.getMenuItems().size()];

            int idx = 0;
            for (MenuComponent item : DesertMenu.this.getMenuItems()) {
                enumeration[idx++] = item;
            }
            cursor = 0;
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
                DesertMenu.this.iterator = null;
            }

            return enumeration[cursor++];
        }

        @Override
        public void checkMutation() throws ConcurrentModificationException {
            if (modificationCount != DesertMenu.this.modificationCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
