package ua.kushnirenko.patterns_combination.flock;

import ua.kushnirenko.patterns_combination.duck.Duck;

import java.util.ArrayList;

public class DuckFlock extends Duck {

    private ArrayList<Duck> flock;

    public ArrayList<Duck> getFlock() {
        return flock;
    }

    public void setFlock(ArrayList<Duck> flock) {
        this.flock = flock;
    }

    public DuckFlock() {
        flock = new ArrayList<>();
    }

    public void attachDuck(Duck duck) {
        flock.add(duck);
    }

    @Override
    public void quack() {
        for (Duck duck : flock) {
            try {
                duck.quack();
            } catch (NoFeedException e) {
                System.out.println("This duck can't quack anymore!");
            }
        }
    }

    @Override
    public void swim() {
        for (Duck duck : flock) {
            duck.swim();
        }
    }

    public void flockSize() {
        System.out.println("There is " + flock.size() + " ducks in the flock.");
    }
}
