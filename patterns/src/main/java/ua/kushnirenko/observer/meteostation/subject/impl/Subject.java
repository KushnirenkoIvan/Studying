package ua.kushnirenko.observer.meteostation.subject.impl;


import ua.kushnirenko.observer.meteostation.observs.Observer;

public interface Subject {

    boolean regiseterObserver(Observer o);

    boolean removeObserver(Observer o);

    void notifyObservres();

    void getData(Observer o);
}
