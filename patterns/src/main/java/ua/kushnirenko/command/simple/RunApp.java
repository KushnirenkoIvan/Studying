package ua.kushnirenko.command.simple;


public class RunApp {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remoteControl.setSlot(lightOn);
        remoteControl.buttonWasPressed();
    }
}
