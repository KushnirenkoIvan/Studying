package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.IndoorLight;


public class LightOffCommand extends Command {

    private IndoorLight indoorLight;

    public LightOffCommand(IndoorLight indoorLight) {
        this.indoorLight = indoorLight;
    }

    @Override
    public void execute() {
        indoorLight.off();
    }

    @Override
    public void undo() {
        indoorLight.on();
    }
}
