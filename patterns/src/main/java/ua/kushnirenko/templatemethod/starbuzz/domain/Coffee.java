package ua.kushnirenko.templatemethod.starbuzz.domain;


public class Coffee extends Beverage {

    @Override
    public void addIngredient() {
        System.out.println("Dripping Coffee through filter.");
    }

    @Override
    public void addAdditive() {
        System.out.println("Adding sugar and milk...");
    }

    @Override
    public void hook() {
        System.out.println("Too much time was milled grains...");
    }
}
