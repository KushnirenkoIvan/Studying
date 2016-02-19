package ua.kushnirenko.decorator.starbuzz.beverage.coffee;

import ua.kushnirenko.decorator.starbuzz.beverage.Component;

public abstract class Coffee extends Component {

    private Integer capacity;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public abstract float cost();

    @Override
    public String taste() {
        return this.getTaste();
    }
}
