package ua.kushnirenko.duck.entity.domain;

import ua.kushnirenko.duck.behaviour.FlyBehaviour;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public abstract class AnthropogenicDuck extends Duck {

    private String material;

    private FlyBehaviour flyBehaviour;

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "AnthropogenicDuck{" +
                "material='" + material + '\'' +
                ", " + super.toString() + " }";
    }
}
