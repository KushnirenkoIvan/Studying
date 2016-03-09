package ua.kushnirenko.command.house.command;


public class MacroCommand extends Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("\n----- Execute macro command -----");
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("\n----- Undo macro command executing -----");
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
