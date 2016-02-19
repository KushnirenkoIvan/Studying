package ua.kushnirenko.decorator.starbuzz.beverage.additive;

import ua.kushnirenko.decorator.starbuzz.beverage.Component;

public class Whip extends CondimentAdditive {

    {
        setTaste("whip");
        setCost(0.4f);
    }

    public Whip() {
        super();
    }

    public Whip(Component c) {
        this.setComponent(c);
    }

}
