package ua.kushnirenko.patterns_combination.behaviour;

public class NoSwim extends SwimBehaviour {

    @Override
    public void swim() {
        System.out.println("I cant swim =( . Dear developer, can you teach me?");
    }
}
