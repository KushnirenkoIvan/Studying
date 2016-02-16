package ua.kushnirenko.duck.entity;

import ua.kushnirenko.duck.behaviour.FlyBehaviour;
import ua.kushnirenko.duck.behaviour.impl.FlyWithJetPack;
import ua.kushnirenko.duck.entity.domain.AnthropogenicDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class ToyDuck extends AnthropogenicDuck {

    private FlyBehaviour flyBehaviour = new FlyWithJetPack(this);

    private Integer price;

    public ToyDuck(String name, String material, Integer price) {
        this.setName(name);
        this.setMaterial(material);
        this.price = price;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    @Override
    public String toString() {
        return "ToyDuck{" +
                "price=" + price +
                ", " + super.toString() + " }";
    }
}
