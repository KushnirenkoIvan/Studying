package ua.kushnirenko.adapter.domain;


public interface Drill {

    void drill();

    void bore();

    void setReverse(boolean reverse);

    void setSpeed(DrillImpl.Speed speed);
}
