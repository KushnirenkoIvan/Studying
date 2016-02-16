package ua.kushnirenko.strategy.behaviour.impl;

import ua.kushnirenko.strategy.behaviour.FlyBehaviour;
import ua.kushnirenko.strategy.entity.domain.AnimalDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class FlyWithWings implements FlyBehaviour {

    private Integer frequency;

    private AnimalDuck aDuck;

    public FlyWithWings(AnimalDuck aDuck) {
        frequency = aDuck.getPower() / aDuck.getWingsLength();
        this.aDuck = aDuck;
    }

    @Override
    public void fly() {
        System.out.println(aDuck + "\n" + (char) 92 + " - this duck can fly with wings!");
    }

    @Override
    public void noiseDive() {

    }
}
