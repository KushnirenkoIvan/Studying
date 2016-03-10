package ua.kushnirenko.adapter.domain;


public class ScrewDriverImpl implements ScrewDriver {

    @Override
    public void screw() {
        System.out.println("Screw... ");
    }

    @Override
    public void unscrew() {
        System.out.println("Unscrew...");
    }
}
