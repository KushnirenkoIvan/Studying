package ua.kushnirenko.state.mightygumball.state.impl;

import ua.kushnirenko.state.mightygumball.domain.GumballMachine;
import ua.kushnirenko.state.mightygumball.state.AbstractState;


public class WinnerState extends AbstractState {

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball1");
    }

    @Override
    public void dispense() {
        System.out.println("You are WINNER! You get two gumballs for your quarter!");

        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {

            gumballMachine.setState(gumballMachine.getSoldOutState());

        } else {

            gumballMachine.releaseBall();

            if (gumballMachine.getCount() > 0) {

                gumballMachine.setState(gumballMachine.getNoQuarterState());

            } else {

                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());

            }
        }
    }
}
