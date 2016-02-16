package ua.kushnirenko.duck.service;

import ua.kushnirenko.duck.entity.MallardDuck;
import ua.kushnirenko.duck.entity.ToyDuck;
import ua.kushnirenko.duck.entity.domain.AnimalDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class RunApp {

    public static void main(String[] args) {
        AnimalDuck mallardDuck = new MallardDuck(2, 10, "DonaldDuck", "Asia");
        ToyDuck toyDuck = new ToyDuck("taddy", "silicon", 100);
        mallardDuck.fly();
        toyDuck.fly();
    }

}
