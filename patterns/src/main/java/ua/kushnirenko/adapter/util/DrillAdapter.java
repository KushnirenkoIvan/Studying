package ua.kushnirenko.adapter.util;

import ua.kushnirenko.adapter.domain.Drill;
import ua.kushnirenko.adapter.domain.DrillImpl;
import ua.kushnirenko.adapter.domain.ScrewDriver;


public class DrillAdapter implements ScrewDriver {

    private Drill drill = new DrillImpl();

    public DrillAdapter(Drill drill) {
        this.drill = drill;
    }

    @Override
    public void screw() {
        drill.setReverse(false);
        drill.setSpeed(DrillImpl.Speed.LOW);
        drill.drill();
    }

    @Override
    public void unscrew() {
        drill.setReverse(true);
        drill.setSpeed(DrillImpl.Speed.LOW);
        drill.drill();
    }
}
