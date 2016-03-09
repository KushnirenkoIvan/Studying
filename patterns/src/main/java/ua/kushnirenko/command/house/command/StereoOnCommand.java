package ua.kushnirenko.command.house.command;

import ua.kushnirenko.command.house.domain.Stereo;


public class StereoOnCommand extends Command {

    private final static int DEFAULT_VOLUME = 15;
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(19);
    }

    @Override
    public void undo() {
        stereo.off();
        stereo.setVolume(DEFAULT_VOLUME);
    }
}
