package ua.kushnirenko.patterns_combination.naturalist;

import ua.kushnirenko.patterns_combination.duck.Duck;

import java.util.ArrayList;

public abstract class DuckObserver {

    ArrayList<Observable> observables;

    public abstract void update(Duck duck);
}
