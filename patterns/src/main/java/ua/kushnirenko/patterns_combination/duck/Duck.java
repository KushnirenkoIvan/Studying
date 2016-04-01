package ua.kushnirenko.patterns_combination.duck;

import ua.kushnirenko.patterns_combination.naturalist.Observable;
import ua.kushnirenko.patterns_combination.behaviour.SwimBehaviour;
import ua.kushnirenko.patterns_combination.behaviour.Swimmable;
import ua.kushnirenko.patterns_combination.naturalist.DuckObserver;

import java.util.HashSet;

public abstract class Duck implements Quackable, Swimmable, Observable {

    protected SwimBehaviour swimBehaviour;

    protected HashSet<DuckObserver> observers = new HashSet<>();

    protected int feed = 3;

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public HashSet<DuckObserver> getObservers() {
        return observers;
    }

    public void setObservers(HashSet<DuckObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void quack() throws NoFeedException {
        notifyObservers();
        if (feed < 0) {
            throw new NoFeedException();
        }
        feed--;
    }

    @Override
    public void registerObserver(DuckObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (DuckObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(DuckObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Duck{ " + this.getClass().getSimpleName() +
                ", feed = " + feed + " }";
    }

    public class NoFeedException extends Exception {

    }
}
