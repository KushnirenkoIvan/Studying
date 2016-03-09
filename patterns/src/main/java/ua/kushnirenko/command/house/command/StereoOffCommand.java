package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.Stereo;


public class StereoOffCommand extends Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
