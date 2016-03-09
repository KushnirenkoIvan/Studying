package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.Hottub;


public class HottabRavageCommand extends Command {

    private Hottub hottub;

    public HottabRavageCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.ravage();
    }

    @Override
    public void undo() {
        hottub.fill();
    }
}
