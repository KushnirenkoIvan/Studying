package ua.kushnirenko.adapter;

import ua.kushnirenko.adapter.domain.Drill;
import ua.kushnirenko.adapter.domain.DrillImpl;
import ua.kushnirenko.adapter.domain.ScrewDriver;
import ua.kushnirenko.adapter.domain.ScrewDriverImpl;
import ua.kushnirenko.adapter.util.DrillAdapter;
import ua.kushnirenko.adapter.util.ScrewDriverAdapter;


public class RunApp {

    public static void main(String[] args) {
        Drill drill = new DrillImpl();

        System.out.println("--------- Using drill ---------");
        drill.drill();
        drill.setReverse(true);
        drill.drill();
        drill.setSpeed(DrillImpl.Speed.LOW);
        drill.bore();
        drill.setReverse(true);
        drill.drill();

        ScrewDriver screwDriver = new ScrewDriverImpl();
        System.out.println("--------- Using drill ---------");
        screwDriver.screw();
        screwDriver.unscrew();

        drill = new ScrewDriverAdapter(screwDriver);
        System.out.println("--------- Using screwdriver instead of drill ---------");
        drill.drill();
        drill.setReverse(true);
        drill.drill();
        try {
            drill.setSpeed(DrillImpl.Speed.HIGH);
        } catch (UnsupportedOperationException e) {
            System.out.println("Screwdriver has only one speed.");
        }
        try {
            drill.bore();
        } catch (UnsupportedOperationException e) {
            System.out.println("You can't bore with screwdriver.");
        }

        screwDriver = new DrillAdapter(drill);
        System.out.println("--------- Using drill instead of screwdriver ---------");
        screwDriver.screw();
        screwDriver.unscrew();
    }
}
