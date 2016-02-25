package ua.kushnirenko.factory.simple;

import ua.kushnirenko.factory.simple.pizza.Pizza;
import ua.kushnirenko.factory.simple.util.PizzaSimpleFactory;

public class SimpleFactoryRunner {

    public static PizzaSimpleFactory pizzaStore = new PizzaSimpleFactory();

    public static void main(String[] args) {
        Pizza p = pizzaStore.createPizza("cheese");
        Pizza p1 = pizzaStore.createPizza("clam");
        Pizza p2 = pizzaStore.createPizza("pepper");
        Pizza p3 = pizzaStore.createPizza("veggie");

    }

}
