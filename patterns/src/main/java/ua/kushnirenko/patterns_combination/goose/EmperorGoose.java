package ua.kushnirenko.patterns_combination.goose;

import ua.kushnirenko.patterns_combination.behaviour.FastSwim;

public class EmperorGoose extends Goose {

    public EmperorGoose() {
        setSwimBehaviour(new FastSwim());
    }

    @Override
    public void honk() {
        System.out.println("Emperor goose says: 'honk-honk!'");
    }

    @Override
    public void swim() {
        getSwimBehaviour().swim();
    }
}
