package ua.kushnirenko.duck.entity;

import ua.kushnirenko.duck.behaviour.FlyBehaviour;
import ua.kushnirenko.duck.behaviour.impl.FlyWithWings;
import ua.kushnirenko.duck.entity.domain.AnimalDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class MallardDuck extends AnimalDuck {

    private FlyBehaviour flyBehaviour;

    private String region;

    public MallardDuck(Integer wingsLength, Integer power, String name, String region) {
        this.region = region;
        this.setWingsLength(wingsLength);
        this.setPower(power);
        this.setName(name);
        flyBehaviour = new FlyWithWings(this);
    }


    public void performFly() {
        flyBehaviour.fly();
    }

    @Override
    public String toString() {
        return "MallardDuck{" +
                " region='" + region + '\'' +
                ", " + super.toString() + " }";
    }
}
