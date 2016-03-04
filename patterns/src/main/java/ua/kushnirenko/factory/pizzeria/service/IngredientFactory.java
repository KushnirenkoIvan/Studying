package ua.kushnirenko.factory.pizzeria.service;

import ua.kushnirenko.factory.pizzeria.domain.ingredient.abstraction.*;
import ua.kushnirenko.factory.pizzeria.enumeration.Vegetable;

import java.util.List;


/**
 * Represents AbstractFactory pattern.
 */
public interface IngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    List<Vegetable> createVegetables();

    Pepperoni createPepperoni();

    Clam createClam();
}

