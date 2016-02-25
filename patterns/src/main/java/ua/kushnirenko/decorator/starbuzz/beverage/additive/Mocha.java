package ua.kushnirenko.decorator.starbuzz.beverage.additive;

import ua.kushnirenko.decorator.starbuzz.beverage.Component;

public class Mocha extends CondimentAdditive {

    {
        setTaste("mocha");
        setCost(0.2f);
    }

    public Mocha() {
        super();
    }

    public Mocha(Component c) {
        this.setComponent(c);
    }

}
