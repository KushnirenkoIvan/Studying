package ua.kushnirenko.decorator.starbuzz.beverage;

public abstract class Component {

    private String taste;

    private float cost;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public abstract float cost();

    public abstract String taste();

}
