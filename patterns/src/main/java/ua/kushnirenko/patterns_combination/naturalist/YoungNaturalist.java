package ua.kushnirenko.patterns_combination.naturalist;

import ua.kushnirenko.patterns_combination.duck.Duck;

public class YoungNaturalist extends DuckObserver {

    private String name;

    public YoungNaturalist(String name) {
        this.name = name;
        System.out.println("\n I'm naturalist. My name is " + name + ". I like to observe duck flocks.\n");
    }

    @Override
    public void update(Duck duck) {
        System.out.println("Naturalist " + name + " says: " + duck + " has been quacked.");
    }
}
