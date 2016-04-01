package ua.kushnirenko.patterns_combination.duck;

import ua.kushnirenko.patterns_combination.behaviour.NoSwim;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setSwimBehaviour(new NoSwim());
    }

    @Override
    public void quack() {
        try {
            super.quack();
            System.out.println("The decoy duck can create sounds like genuine duck quacking.");
        } catch (NoFeedException e) {
            System.out.println("This duck can't quack anymore! Try to feed it.");
        }
    }

    @Override
    public void swim() {
        System.out.println("Decoy duck swimming: ");
        getSwimBehaviour().swim();
    }

}
