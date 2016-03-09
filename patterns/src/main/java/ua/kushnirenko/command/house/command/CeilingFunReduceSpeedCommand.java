package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.CeilingFun;


public class CeilingFunReduceSpeedCommand extends Command {

    private CeilingFun ceilingFun;
    private CeilingFun.CeilingFunSpeed lastSpeed;

    public CeilingFunReduceSpeedCommand(CeilingFun ceilingFun) {
        this.ceilingFun = ceilingFun;
    }

    @Override
    public void execute() {
        lastSpeed = ceilingFun.getSpeed();
        ceilingFun.decreaseSpeed();
    }

    @Override
    public void undo() {
        ceilingFun.setSpeed(lastSpeed);
    }
}
