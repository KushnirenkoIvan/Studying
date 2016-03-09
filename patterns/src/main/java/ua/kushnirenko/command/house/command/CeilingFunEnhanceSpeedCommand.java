package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.CeilingFun;


public class CeilingFunEnhanceSpeedCommand extends Command {

    private CeilingFun ceilingFun;
    private CeilingFun.CeilingFunSpeed lastSpeed;

    public CeilingFunEnhanceSpeedCommand(CeilingFun ceilingFun) {
        this.ceilingFun = ceilingFun;
    }

    @Override
    public void execute() {
        lastSpeed = ceilingFun.getSpeed();
        ceilingFun.increaseSpeed();
    }

    @Override
    public void undo() {
        ceilingFun.setSpeed(lastSpeed);
    }
}
