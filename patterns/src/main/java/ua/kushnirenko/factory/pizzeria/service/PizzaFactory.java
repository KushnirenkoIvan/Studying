package ua.kushnirenko.factory.pizzeria.service;

import ua.kushnirenko.factory.pizzeria.domain.pizza.Pizza;
import ua.kushnirenko.factory.pizzeria.enumeration.PizzaKind;


/**
 * Represents FactoryMethod pattern.
 */
public abstract class PizzaFactory {

    protected IngredientFactory ingredientFactory;

    protected abstract Pizza createPizza(PizzaKind kind);

    /**
     * This method might be declared as final for protect any changes in subclasses.
     */
    public Pizza orderPizza(PizzaKind kind) {
        Pizza pizza;

        pizza = createPizza(kind);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
