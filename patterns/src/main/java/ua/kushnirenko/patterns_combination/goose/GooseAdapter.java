package ua.kushnirenko.patterns_combination.goose;

import ua.kushnirenko.patterns_combination.duck.Duck;

public class GooseAdapter extends Duck {

    private Goose goose;

    public Goose getGoose() {
        return goose;
    }

    public void setGoose(Goose goose) {
        this.goose = goose;
    }

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void swim() {
        goose.swim();
    }
}
