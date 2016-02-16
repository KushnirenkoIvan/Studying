package ua.kushnirenko.strategy.service;

import ua.kushnirenko.strategy.entity.MallardDuck;
import ua.kushnirenko.strategy.entity.ToyDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class RunApp {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(2, 10, "DonaldDuck", "Asia");
        ToyDuck toyDuck = new ToyDuck("taddy", "silicon", 100);
        mallardDuck.performFly();
        toyDuck.performFly();
    }

}
