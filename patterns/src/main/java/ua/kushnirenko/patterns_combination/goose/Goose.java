package ua.kushnirenko.patterns_combination.goose;

import ua.kushnirenko.patterns_combination.behaviour.SwimBehaviour;
import ua.kushnirenko.patterns_combination.behaviour.Swimmable;

public abstract class Goose implements Honkable, Swimmable {

    private SwimBehaviour swimBehaviour;

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
}
