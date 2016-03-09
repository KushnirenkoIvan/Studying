package ua.kushnirenko.command.simple;


public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
