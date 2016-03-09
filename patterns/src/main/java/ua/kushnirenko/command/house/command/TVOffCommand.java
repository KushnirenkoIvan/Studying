package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.TV;


public class TVOffCommand extends Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
