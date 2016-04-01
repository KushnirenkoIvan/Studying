package ua.kushnirenko.patterns_combination.duck.decorator;

import ua.kushnirenko.patterns_combination.duck.Duck;
import ua.kushnirenko.patterns_combination.naturalist.DuckObserver;

public class QuackCountDuck extends Duck {

    private Duck duck;
    private static int quackCount = 0;

    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public static int getQuackCount() {
        return quackCount;
    }

    public static void setQuackCount(int quackCount) {
        QuackCountDuck.quackCount = quackCount;
    }

    public QuackCountDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        try {
            duck.quack();
        } catch (NoFeedException e) {
            System.out.println("This duck can't quack anymore!");
        }
        quackCount++;
    }

    @Override
    public void swim() {
        duck.swim();
    }

    @Override
    public void registerObserver(DuckObserver observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
