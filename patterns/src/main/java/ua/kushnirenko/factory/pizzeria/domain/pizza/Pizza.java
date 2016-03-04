package ua.kushnirenko.factory.pizzeria.domain.pizza;

import ua.kushnirenko.factory.pizzeria.domain.ingredient.abstraction.*;
import ua.kushnirenko.factory.pizzeria.enumeration.Vegetable;
import ua.kushnirenko.factory.pizzeria.service.IngredientFactory;

import java.util.ArrayList;
import java.util.List;


public class Pizza {

    private IngredientFactory ingredientFactory;

    private double price;

    private String name;

    private Dough dough;

    private Sauce sauce;

    private Cheese cheese;

    List<Vegetable> veggies = new ArrayList<>();

    private Pepperoni pepperoni;

    private Clam clam;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vegetable> getVeggies() {
        return veggies;
    }

    protected Pizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;

        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.clam = ingredientFactory.createClam();
        this.pepperoni = ingredientFactory.createPepperoni();
        this.veggies = ingredientFactory.createVegetables();
    }

    public void prepare() {
        System.out.println("your pizza is prepared!");
    }

    public void bake() {
        System.out.println("Ypu pizza is backed!");
    }

    public void cut() {
        System.out.println("Cutting your pizza...");
    }

    public void box() {
        System.out.println("Boxing your pizza!");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "\n price=" + price +
                ",\n name='" + name + '\'' +
                ",\n dough=" + dough +
                ",\n sauce=" + sauce +
                ",\n cheese=" + cheese +
                ",\n veggies=" + veggies +
                ",\n pepperoni=" + pepperoni +
                ",\n clam=" + clam +
                "\n}";
    }
}


