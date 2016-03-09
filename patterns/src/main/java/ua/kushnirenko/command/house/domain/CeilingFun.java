package ua.kushnirenko.command.house.domain;


public class CeilingFun {

    public enum CeilingFunSpeed {
        HIGH, MEDIUM, LOW
    }

    private CeilingFunSpeed speed = CeilingFunSpeed.LOW;

    private boolean turnedOn = false;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public CeilingFunSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(CeilingFunSpeed speed) {
        if (isTurnedOn()) {
            this.speed = speed;
            System.out.println("Set up speed to :" + speed.toString());
        } else {
            System.out.println("You must turn on ceiling fun before setting up speed.");
        }
    }

    public void on() {
        setTurnedOn(true);
        System.out.println("Ceiling fun is turned ON. Speed: " + speed.toString());
    }

    public void off() {
        if (isTurnedOn()) {
            setTurnedOn(false);
            System.out.println("Ceiling fun is turned OFF.");
        }
    }

    public void increaseSpeed() {
        if (speed == CeilingFunSpeed.LOW) {
            setSpeed(CeilingFunSpeed.MEDIUM);
        } else if (speed == CeilingFunSpeed.MEDIUM) {
            setSpeed(CeilingFunSpeed.HIGH);
        } else {
            System.out.println("Cannot increase: the speed of ceiling fun is set up to HIGH value.");
        }
    }

    public void decreaseSpeed() {
        if (speed == CeilingFunSpeed.HIGH) {
            setSpeed(CeilingFunSpeed.MEDIUM);
        } else if (speed == CeilingFunSpeed.MEDIUM) {
            setSpeed(CeilingFunSpeed.LOW);
        } else {
            System.out.println("Cannot decrease: the speed of ceiling fun is set up to LOW value.");
        }
    }
}
