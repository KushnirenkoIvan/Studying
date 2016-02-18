package ua.kushnirenko.strategy.duck.behaviour.impl;

import ua.kushnirenko.strategy.duck.behaviour.FlyBehaviour;
import ua.kushnirenko.strategy.duck.entity.ToyDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class FlyWithJetPack implements FlyBehaviour {

    private ToyDuck toyDuck;

    public FlyWithJetPack(ToyDuck tDuck) {
        this.toyDuck = tDuck;
    }

    @Override
    public void fly() {
        System.out.println(toyDuck + "\n" + (char) 92 + " - this duck can fly with jet pack !");
    }

    @Override
    public void noiseDive() {

    }
}
