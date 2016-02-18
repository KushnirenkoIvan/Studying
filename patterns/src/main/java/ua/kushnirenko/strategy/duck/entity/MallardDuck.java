package ua.kushnirenko.strategy.duck.entity;

import ua.kushnirenko.strategy.duck.behaviour.impl.FlyWithWings;
import ua.kushnirenko.strategy.duck.entity.domain.AnimalDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class MallardDuck extends AnimalDuck {

    private String region;

    public MallardDuck(Integer wingsLength, Integer power, String name, String region) {
        this.region = region;
        this.setWingsLength(wingsLength);
        this.setPower(power);
        this.setName(name);
        this.setFlyBehaviour(new FlyWithWings(this));
    }

    public void performFly() {
        this.getFlyBehaviour().fly();
    }

    @Override
    public String toString() {
        return "MallardDuck{" +
                " region='" + region + '\'' +
                ", " + super.toString() + " }";
    }
}
