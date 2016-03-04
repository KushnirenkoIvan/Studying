package ua.kushnirenko.factory.pizzeria.service;

import ua.kushnirenko.factory.pizzeria.domain.pizza.*;
import ua.kushnirenko.factory.pizzeria.enumeration.PizzaKind;


/**
 * This class represents SimpleFactory pattern -
 *  only separation of creation logic and utility logic is provided by them.
 * Initialization pizza is commented because after providing FactoryMethod pattern support every
 * Pizza requires ingredient factory.
 */
public class SimplePizzaFactory {

    private Pizza createPizza(PizzaKind kind) {
        Pizza pizza = null;
        switch (kind) {
            case CHEESE_PIZZA:
//                pizza = new CheesePizza();
                break;
            case CLAM_PIZZA:
//                pizza = new ClamPizza();
                break;
            case PEPPERONI_PIZZA:
//                pizza = new PepperoniPizza();
                break;
            case VEGGIE_PIZZA:
//                pizza = new VeggiePizza();
                break;
            default:
//                pizza = new CheesePizza();
        }
        return pizza;
    }

    public Pizza orderPizza(PizzaKind kind) {
        Pizza pizza = createPizza(kind);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        new SimplePizzaFactory().orderPizza(PizzaKind.PEPPERONI_PIZZA);
    }
}
