package ua.kushnirenko.factory.pizzeria.domain.ingredient.abstraction;


public abstract class Ingredient {

    protected String name;

    @Override
    public String toString() {
        return name;
    }
}
