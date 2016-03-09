package ua.kushnirenko.command.house.util;

import ua.kushnirenko.command.house.command.Command;


public class RemoteControl {

    private int slotCount = 3;

    private Command[] onCommands;
    private Command[] offCommands;

    private Command lastCommand;

    private Command noCommand = new Command() {
        @Override
        public void execute() {
            System.out.println("There is no commands...");
        }

        @Override
        public void undo() {
            System.out.println("There is no commands...");
        }
    };

    public RemoteControl(int slotCount) {
        this.slotCount = slotCount;
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        /*
        This code will need for protection user to check like this: 'if (command != null) { ...execute() }'
         */
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------- Remote Control-------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] "
                    + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}