package ua.kushnirenko.templatemethod.starbuzz.domain;


public abstract class Beverage {

    public abstract void addIngredient();

    public abstract void addAdditive();

    public void prepareRecipe(Beverage beverage) {
        boilWater();
        beverage.addIngredient();
        beverage.hook();
        beverage.addAdditive();
        beverage.addCondiments();
        pourInCup();
    }

    public final void boilWater() {
        System.out.println("Boiling water...");
    }

    public final void pourInCup() {
        System.out.println("Pouring beverage into cup...");
    }

    public void hook() {
    }

    public void addCondiments() {
    }
}
