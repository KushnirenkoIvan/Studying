package ua.kushnirenko.strategy.duck.entity;

import ua.kushnirenko.strategy.duck.behaviour.impl.FlyWithJetPack;
import ua.kushnirenko.strategy.duck.entity.domain.AnthropogenicDuck;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public class ToyDuck extends AnthropogenicDuck {

    private Integer price;

    public ToyDuck(String name, String material, Integer price) {
        this.setName(name);
        this.setMaterial(material);
        this.price = price;
        this.setFlyBehaviour(new FlyWithJetPack(this));
    }

    public void performFly() {
        this.getFlyBehaviour().fly();
    }

    @Override
    public String toString() {
        return "ToyDuck{" +
                "price=" + price +
                ", " + super.toString() + " }";
    }
}
