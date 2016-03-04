package ua.kushnirenko.factory.pizzeria.domain.pizza;

import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;


public class VeggiePizza extends Pizza {

    {
        setName("Veggie pizza");
        setPrice(10.29);
    }

    public VeggiePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
