package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.GarageDoor;


public class GarageDoorCloseCommand extends Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
