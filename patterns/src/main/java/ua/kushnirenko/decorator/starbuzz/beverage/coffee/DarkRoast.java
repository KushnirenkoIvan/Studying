package ua.kushnirenko.decorator.starbuzz.beverage.coffee;

public class DarkRoast extends Coffee {

    public DarkRoast() {
        setTaste("DarkRoast");
        setCost(0.99f);
    }

    @Override
    public float cost() {
        return getCost();
    }

}
