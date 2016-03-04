package ua.kushnirenko.factory.pizzeria.domain.pizza;

import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;


public class PepperoniPizza extends Pizza {

    {
        setName("Pepperoni pizza");
        setPrice(14.99);
    }

    public PepperoniPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
