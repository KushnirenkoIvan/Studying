package ua.kushnirenko.adapter.domain;


public class DrillImpl implements Drill {

    public enum Speed {
        LOW, MEDIUM, HIGH
    }

    private boolean reverse = false;
    private Speed speed = Speed.MEDIUM;

    public DrillImpl() {
        reverse = false;
        speed = Speed.MEDIUM;
    }

    @Override
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @Override
    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public void drill() {
        if (!reverse) {
            System.out.println("Drill in...");
        } else {
            System.out.println("Drill out...");
        }
    }

    @Override
    public void bore() {
        setReverse(false);
        System.out.println("Boring...");

    }
}
