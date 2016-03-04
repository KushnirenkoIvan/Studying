package ua.kushnirenko.factory.pizzeria;

import ua.kushnirenko.factory.pizzeria.enumeration.PizzaKind;
import ua.kushnirenko.factory.pizzeria.service.PizzaFactory;
import ua.kushnirenko.factory.pizzeria.service.filiation.ChicagoPizzaFactory;
import ua.kushnirenko.factory.pizzeria.service.filiation.NYPizzaFactory;


public class PizzaStore {

    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void gerPizza(PizzaKind kind) {
        factory.orderPizza(kind);
    }

    public static void main(String[] args) {
        PizzaStore nyPStore = new PizzaStore(new NYPizzaFactory());
        nyPStore.gerPizza(PizzaKind.CHEESE_PIZZA);

        PizzaStore chicagoPStore = new PizzaStore(new ChicagoPizzaFactory());
        chicagoPStore.gerPizza(PizzaKind.CHEESE_PIZZA);
    }
}
