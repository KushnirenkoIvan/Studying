package ua.kushnirenko.duck.behaviour.impl;

import ua.kushnirenko.duck.behaviour.FlyBehaviour;
import ua.kushnirenko.duck.entity.domain.AnimalDuck;

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
