package ua.kushnirenko.patterns_combination.factory;

import ua.kushnirenko.patterns_combination.duck.*;
import ua.kushnirenko.patterns_combination.duck.decorator.QuackCountDuck;
import ua.kushnirenko.patterns_combination.flock.DuckFlock;

public class ExtendedDuckFactory {

    public Duck createDuck(DuckKind kind) {

        Duck duck = null;

        switch (kind) {
            case MALLARD:
                duck = new QuackCountDuck(new MallardDuck());
                break;
            case DECOY:
                duck = new QuackCountDuck(new DecoyDuck());
                break;
            case GREY:
                duck = new QuackCountDuck(new GreyDuck());
                break;
            default:
                duck = new QuackCountDuck(new RedHeadDuck());
        }
        return duck;
    }

    public DuckFlock createDuckFlock(DuckKind[] duckKinds) {

        DuckFlock duckFlock = new DuckFlock();

        for (DuckKind kind : duckKinds) {
            duckFlock.attachDuck(createDuck(kind));
        }

        return duckFlock;
    }
}
