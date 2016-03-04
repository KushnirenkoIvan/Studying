package ua.kushnirenko.factory.pizzeria.domain.pizza;

import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;


public class ClamPizza extends Pizza {

    {
        setName("Clam pizza");
        setPrice(17.79);
    }

    public ClamPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
