package ua.kushnirenko.iterator.composite.menu;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.menu.domain.MenuItem;
import ua.kushnirenko.iterator.composite.util.Iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;


public class PancakeHouseMenu extends Menu {

    private ArrayList<MenuComponent> menuItems;

    public ArrayList<MenuComponent> getMenuItems() {
        return menuItems;
    }

    public PancakeHouseMenu() {
        type = "BREAKFAST";
        menuItems = new ArrayList<>();
        modificationCount = 0;

        add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));
        add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        add(new DesertMenu());
    }

    @Override
    public void add(MenuComponent component) {
        menuItems.add(component);
        modificationCount++;
    }

    @Override
    public Iterator iterator() {
        if (iterator == null) {
            iterator = new PancakeHouseMenuIterator(getMenuItems(), modificationCount);
        }
        return iterator;
    }

    private class PancakeHouseMenuIterator extends Iterator<MenuComponent> {

        private PancakeHouseMenuIterator(ArrayList<MenuComponent> list, int modificationCount) {
            this.modificationCount = modificationCount;
            enumeration = new MenuComponent[PancakeHouseMenu.this.getMenuItems().size()];

            int idx = 0;
            for (MenuComponent item : PancakeHouseMenu.this.getMenuItems()) {
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
                PancakeHouseMenu.this.iterator = null;
            }

            return enumeration[cursor++];
        }

        @Override
        public void checkMutation() throws ConcurrentModificationException {
            if (modificationCount != PancakeHouseMenu.this.modificationCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
