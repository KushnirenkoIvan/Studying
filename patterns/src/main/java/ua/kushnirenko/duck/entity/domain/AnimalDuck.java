package ua.kushnirenko.duck.entity.domain;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public abstract class AnimalDuck extends Duck {

    private Integer wingsLength;

    private Integer power;

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

    public void fly() {

    }

    @Override
    public String toString() {
        return "AnimalDuck{" +
                "wingsLength=" + wingsLength +
                ", power=" + power +
                ", " + super.toString() + " }";
    }
}
