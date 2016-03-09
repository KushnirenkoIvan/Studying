package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.IndoorLight;


public class LightOnCommand extends Command {

    private IndoorLight indoorLight;

    public LightOnCommand(IndoorLight indoorLight) {
        this.indoorLight = indoorLight;
    }

    @Override
    public void execute() {
        indoorLight.on();
    }

    @Override
    public void undo() {
        indoorLight.off();
    }
}
