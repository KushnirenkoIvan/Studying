package ua.kushnirenko.factory.pizzeria.domain.pizza;

import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;


public class CheesePizza extends Pizza {

    {
        setName("Cheese pizza");
        setPrice(12.45);
    }

    public CheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
