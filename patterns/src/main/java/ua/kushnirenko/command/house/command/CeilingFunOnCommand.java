package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.CeilingFun;


public class CeilingFunOnCommand extends Command {

    private CeilingFun fun;

    public CeilingFunOnCommand(CeilingFun fun) {
        this.fun = fun;
    }

    @Override
    public void execute() {
        fun.on();
    }

    @Override
    public void undo() {
        fun.off();
    }
}
