package ua.kushnirenko.iterator.composite.menu.domain;


public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract String toPrint();
}
