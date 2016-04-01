package ua.kushnirenko.patterns_combination.factory;

import ua.kushnirenko.patterns_combination.duck.*;

public class DuckFactory {

    public Duck createDuck(DuckKind kind) {

        Duck duck = null;

        switch (kind) {
            case MALLARD:
                duck = new MallardDuck();
                break;
            case DECOY:
                duck = new DecoyDuck();
                break;
            case GREY:
                duck = new GreyDuck();
                break;
            default:
                duck = new RedHeadDuck();
        }
        return duck;
    }
}
