package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.TV;


public class TVOnCommand extends Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
