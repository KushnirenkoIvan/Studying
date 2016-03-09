package ua.kushnirenko.command.house;

import ua.kushnirenko.command.house.command.*;
import ua.kushnirenko.command.house.domain.*;
import ua.kushnirenko.command.house.util.RemoteControl;


public class RunApp {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(7);

        IndoorLight light = new IndoorLight();
        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));

        GarageDoor garageDoor = new GarageDoor();
        remoteControl.setCommand(1, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));

        Stereo stereo = new Stereo();
        remoteControl.setCommand(2, new StereoOnCommand(stereo), new StereoOffCommand(stereo));

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        CeilingFun fun = new CeilingFun();
        remoteControl.setCommand(3, new CeilingFunOnCommand(fun), new CeilingFunOffCommand(fun));
        remoteControl.setCommand(4, new CeilingFunEnhanceSpeedCommand(fun), new CeilingFunReduceSpeedCommand(fun));

        remoteControl.onButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.onButtonWasPressed(4);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
        remoteControl.offButtonWasPressed(3);

        System.out.println("\nNot programmed button: ");
        remoteControl.onButtonWasPressed(5);
        remoteControl.offButtonWasPressed(5);

        TV tv = new TV();
        Hottub hottub = new Hottub();
        Command[] partyOn = {
                new HottabFillCommand(hottub),
                new TVOnCommand(tv),
                new LightOnCommand(light),
                new StereoOnCommand(stereo)};

        Command[] partyOff = {
                new HottabRavageCommand(hottub),
                new TVOffCommand(tv),
                new LightOffCommand(light),
                new StereoOffCommand(stereo)
        };

        remoteControl.setCommand(6, new MacroCommand(partyOn), new MacroCommand(partyOff));
        remoteControl.onButtonWasPressed(6);
        remoteControl.offButtonWasPressed(6);
    }
}
