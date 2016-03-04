package ua.kushnirenko.factory.pizzeria.service.filiation;

import ua.kushnirenko.factory.pizzeria.domain.pizza.*;
import ua.kushnirenko.factory.pizzeria.enumeration.PizzaKind;
import ua.kushnirenko.factory.pizzeria.service.PizzaFactory;


public class NYPizzaFactory extends PizzaFactory {

    public NYPizzaFactory() {
        ingredientFactory = new NYIngredientFactory();
    }

    public Pizza createPizza(PizzaKind kind) {
        System.out.println("Creating New York style pizza.");
        Pizza pizza = null;
        switch (kind) {
            case PEPPERONI_PIZZA:
                pizza = new PepperoniPizza(ingredientFactory);
                break;
            case CLAM_PIZZA:
                pizza = new ClamPizza(ingredientFactory);
                break;
            case CHEESE_PIZZA:
                pizza = new CheesePizza(ingredientFactory);
                break;
            case VEGGIE_PIZZA:
                pizza = new VeggiePizza(ingredientFactory);
                break;
            default:
                pizza = new CheesePizza(ingredientFactory);
        }
        System.out.println("New pizza was prepared for sale: " + pizza);
        return pizza;
    }

}
