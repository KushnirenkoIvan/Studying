package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.CeilingFun;


public class CeilingFunOffCommand extends Command {

    private CeilingFun fun;

    public CeilingFunOffCommand(CeilingFun fun) {
        this.fun = fun;
    }

    @Override
    public void execute() {
        fun.off();
    }

    @Override
    public void undo() {
        fun.on();
    }
}
