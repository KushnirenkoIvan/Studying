package ua.kushnirenko.command.house.domain;


public class Stereo {

    public void on() {
        System.out.println("Stereo system turns ON.");
    }

    public void off() {
        System.out.println("Stereo system turns OFF.");
    }

    public void setVolume(int volume) {
        System.out.println("Music volume set up to: " + volume + ".");
    }
}
