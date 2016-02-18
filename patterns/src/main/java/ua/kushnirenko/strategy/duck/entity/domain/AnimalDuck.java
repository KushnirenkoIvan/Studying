package ua.kushnirenko.strategy.duck.entity.domain;

import ua.kushnirenko.strategy.duck.behaviour.FlyBehaviour;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public abstract class AnimalDuck extends Duck {

    private Integer wingsLength;

    private Integer power;

    private FlyBehaviour flyBehaviour;

    public Integer getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(Integer wingsLength) {
        this.wingsLength = wingsLength;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    @Override
    public String toString() {
        return "AnimalDuck{" +
                "wingsLength=" + wingsLength +
                ", power=" + power +
                ", " + super.toString() + " }";
    }
}
