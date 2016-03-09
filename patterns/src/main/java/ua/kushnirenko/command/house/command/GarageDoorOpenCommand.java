package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.GarageDoor;


public class GarageDoorOpenCommand extends Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
