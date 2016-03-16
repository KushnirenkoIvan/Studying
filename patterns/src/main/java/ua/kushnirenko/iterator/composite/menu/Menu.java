package ua.kushnirenko.iterator.composite.menu;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;
import ua.kushnirenko.iterator.composite.util.Iterator;


public abstract class Menu extends MenuComponent implements ua.kushnirenko.iterator.composite.util.Iterable {

    protected int modificationCount;
    protected String type;
    protected Iterator iterator;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public abstract void add(MenuComponent menuComponent);

    @Override
    public abstract Iterator iterator();

    @Override
    public String toPrint() {

        StringBuilder sb = new StringBuilder("----- " + this.getClass().getSimpleName() + " menu -----\n");

        Iterator<MenuComponent> iterator = this.iterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next().toPrint());
        }
        sb.append("\n*********************************************************\n");

        return sb.toString();
    }
}
