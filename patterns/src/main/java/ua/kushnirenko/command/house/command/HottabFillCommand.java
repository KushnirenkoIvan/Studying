package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.Hottub;


public class HottabFillCommand extends Command {

    private Hottub hottub;

    public HottabFillCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.fill();
    }

    @Override
    public void undo() {
        hottub.ravage();
    }
}
