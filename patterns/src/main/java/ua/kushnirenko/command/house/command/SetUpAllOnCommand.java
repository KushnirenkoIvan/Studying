package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.CeilingFun;
import ua.kushnirenko.command.house.domain.GarageDoor;
import ua.kushnirenko.command.house.domain.IndoorLight;
import ua.kushnirenko.command.house.domain.Stereo;


public class SetUpAllOnCommand extends Command {

    private Stereo stereo;
    private GarageDoor door;
    private IndoorLight light;
    private CeilingFun fun;

    public SetUpAllOnCommand(Stereo stereo, GarageDoor door, IndoorLight light, CeilingFun fun) {
        this.stereo = stereo;
        this.door = door;
        this.light = light;
        this.fun = fun;
    }

    @Override
    public void execute() {
        stereo.on();
        door.open();
        light.on();
        fun.on();
    }

    @Override
    public void undo() {
        stereo.off();
        door.close();
        light.off();
        fun.off();
    }
}
