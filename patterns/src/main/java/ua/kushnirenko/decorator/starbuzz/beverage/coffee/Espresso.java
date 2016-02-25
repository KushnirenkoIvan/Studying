package ua.kushnirenko.decorator.starbuzz.beverage.coffee;


public class Espresso extends Coffee {

    public Espresso() {
        setTaste("Espresso");
        setCost(0.49f);
    }

    @Override
    public float cost() {
        return getCost();
    }

}
