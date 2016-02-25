package ua.kushnirenko.factory.simple.util;

import ua.kushnirenko.factory.simple.pizza.*;

public class PizzaSimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "pepper":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                pizza = new CheesePizza();
        }
        System.out.println("New pizza was prepared for sale: " + pizza);
        return pizza;
    }

}
