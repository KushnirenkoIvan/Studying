package ua.kushnirenko.factory.pizzeria.service.filiation;

import ua.kushnirenko.factory.pizzeria.domain.ingredient.*;
import ua.kushnirenko.factory.pizzeria.domain.ingredient.abstraction.*;
import ua.kushnirenko.factory.pizzeria.enumeration.Vegetable;
import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;

import java.util.Arrays;
import java.util.List;


public class ChicagoIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Vegetable> createVegetables() {
        return Arrays.asList(Vegetable.EGGPALNT, Vegetable.OLIVE, Vegetable.GARLIC);
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
