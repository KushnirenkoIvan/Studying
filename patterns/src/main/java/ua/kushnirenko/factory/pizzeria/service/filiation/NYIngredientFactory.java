package ua.kushnirenko.factory.pizzeria.service.filiation;

import ua.kushnirenko.factory.pizzeria.domain.ingredient.*;
import ua.kushnirenko.factory.pizzeria.domain.ingredient.abstraction.*;
import ua.kushnirenko.factory.pizzeria.enumeration.Vegetable;
import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;

import java.util.Arrays;
import java.util.List;


public class NYIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public List<Vegetable> createVegetables() {
        return Arrays.asList(Vegetable.ONION, Vegetable.GARLIC, Vegetable.MUSHROOM);
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PaprikaPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
