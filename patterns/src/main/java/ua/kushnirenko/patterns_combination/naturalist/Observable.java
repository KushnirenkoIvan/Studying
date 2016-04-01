package ua.kushnirenko.patterns_combination.naturalist;

public interface Observable {

    void registerObserver(DuckObserver observer);

    void notifyObservers();

    void removeObserver(DuckObserver observer);

}
