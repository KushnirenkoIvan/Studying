package ua.kushnirenko.patterns_combination;

import ua.kushnirenko.patterns_combination.duck.*;
import ua.kushnirenko.patterns_combination.duck.decorator.QuackCountDuck;
import ua.kushnirenko.patterns_combination.factory.DuckFactory;
import ua.kushnirenko.patterns_combination.factory.DuckKind;
import ua.kushnirenko.patterns_combination.factory.ExtendedDuckFactory;
import ua.kushnirenko.patterns_combination.flock.DuckFlock;
import ua.kushnirenko.patterns_combination.goose.EmperorGoose;
import ua.kushnirenko.patterns_combination.goose.GooseAdapter;
import ua.kushnirenko.patterns_combination.naturalist.YoungNaturalist;

public class DuckSimulatorRunApp {

    public static void main(String[] args) {

        System.out.println("------------- DUCK SIMULATOR -------------");
        try {
            new DuckSimulatorRunApp().simulate();
        } catch (Duck.NoFeedException e) {
            e.printStackTrace();
        }
    }

    public void simulate() throws Duck.NoFeedException {
        Duck mallardDuck = new QuackCountDuck(new MallardDuck());
        Duck redHeadDuck = new QuackCountDuck(new RedHeadDuck());
        Duck greyDuck = new QuackCountDuck(new GreyDuck());
        Duck decoyDuck = new QuackCountDuck(new DecoyDuck());

        Duck goose = new GooseAdapter(new EmperorGoose());

        System.out.println("\n--- Quacking: \n");
        mallardDuck.quack();
        redHeadDuck.quack();
        greyDuck.quack();
        decoyDuck.quack();
        goose.quack();

        System.out.println("\nThere was quacked " + QuackCountDuck.getQuackCount() + " times.");

        System.out.println("\n--- Swimming: \n");
        mallardDuck.swim();
        redHeadDuck.swim();
        greyDuck.swim();
        decoyDuck.swim();

        System.out.println("\n--- Duck flock: \n");

        QuackCountDuck.setQuackCount(0);

        DuckFactory duckFactory = new DuckFactory();

        DuckFlock duckFlock = new DuckFlock();
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.MALLARD)));
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.MALLARD)));
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.MALLARD)));
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.DECOY)));
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.GREY)));
        duckFlock.attachDuck(new QuackCountDuck(duckFactory.createDuck(DuckKind.REDHEAD)));
        duckFlock.attachDuck(new GooseAdapter(new EmperorGoose())); // Something wrong is here...

        duckFlock.flockSize();

        System.out.println("\n--- Flock swimming: \n");
        duckFlock.swim();

        System.out.println("\n--- Flock quacking: \n");
        duckFlock.quack();

        System.out.println("\nThere was quacked " + QuackCountDuck.getQuackCount() + " times.");

        System.out.println("\n--- Observable flock: ");

        ExtendedDuckFactory extendedDuckFactory = new ExtendedDuckFactory();

        DuckKind[] duckKinds = {DuckKind.MALLARD, DuckKind.REDHEAD, DuckKind.MALLARD, DuckKind.REDHEAD};
        DuckFlock observableDuckFlock = extendedDuckFactory.
                createDuckFlock(duckKinds);

        YoungNaturalist naturalist = new YoungNaturalist("Vasya");

        for (Duck duck : observableDuckFlock.getFlock()) {
            duck.registerObserver(naturalist);
        }

        observableDuckFlock.quack();

        System.out.println("This duck like 'quack': ");
        for (int i = 0; i < 4; i++) {
            observableDuckFlock.getFlock().get(1).quack();
        }

    }
}
