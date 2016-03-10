package ua.kushnirenko.adapter.util;

import ua.kushnirenko.adapter.domain.Drill;
import ua.kushnirenko.adapter.domain.DrillImpl;
import ua.kushnirenko.adapter.domain.ScrewDriver;


public class ScrewDriverAdapter implements Drill {

    private ScrewDriver screwDriver;
    private boolean reverse;

    public ScrewDriverAdapter(ScrewDriver screwDriver) {
        this.screwDriver = screwDriver;
        reverse = false;
    }

    @Override
    public void drill() {
        if (!reverse) {
            System.out.println("You have to push down... And do it many times.*" +
                    "\n\t*Some another adapter methods was called.");
            screwDriver.screw();
        } else {
            System.out.println("You have to do it many times.");
            screwDriver.unscrew();
        }
    }

    @Override
    public void bore() {
        throw new UnsupportedOperationException("You can't bore with screw driver.");
    }

    @Override
    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public void setSpeed(DrillImpl.Speed speed) {
        if (speed.equals(DrillImpl.Speed.LOW)) {
            System.out.println("ScrewDriver has always low speed.");
        } else {
            throw new UnsupportedOperationException("You can't set speed for screw driver.");
        }
    }
}
