package ua.kushnirenko.patterns_combination.duck;

import ua.kushnirenko.patterns_combination.behaviour.FastSwim;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setSwimBehaviour(new FastSwim());
    }

    @Override
    public void quack() {
        try {
            super.quack();
            System.out.println("Mallard duck says: 'quack!'");
        } catch (NoFeedException e) {
            System.out.println("This duck can't quack anymore! Try to feed it.");
        }
    }

    @Override
    public void swim() {
        System.out.println("Mallard duck swimming: ");
        getSwimBehaviour().swim();
    }
}
