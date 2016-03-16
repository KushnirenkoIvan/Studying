package ua.kushnirenko.iterator.composite.util;

import ua.kushnirenko.iterator.composite.menu.domain.MenuComponent;

import java.util.ConcurrentModificationException;


public abstract class Iterator<T> {

    protected MenuComponent[] enumeration;
    protected int modificationCount;
    protected int cursor;

    public abstract T next();

    public abstract boolean hasNext();

    public abstract void checkMutation() throws ConcurrentModificationException;
}
