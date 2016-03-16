package ua.kushnirenko.iterator.composite.util;

import ua.kushnirenko.iterator.composite.menu.Menu;
import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;

import java.util.ConcurrentModificationException;
import java.util.Stack;


public class CompositeIterator extends Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(((Menu) menuComponent).iterator());
            }
            return menuComponent;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public void checkMutation() throws ConcurrentModificationException {
        throw new UnsupportedOperationException();
    }

}
