package ua.kushnirenko.decorator.starbuzz.beverage.additive;

import ua.kushnirenko.decorator.starbuzz.beverage.Component;

public abstract class CondimentAdditive extends Component {

    private Component component;

    public CondimentAdditive() {
    }

    public CondimentAdditive(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public float cost() {
        if (component == null) {
            return this.getCost();
        } else {
            return component.cost() + this.getCost();
        }
    }

    @Override
    public String taste() {
        if (component == null) {
            return this.getTaste();
        } else {
            return component.taste() + " + " + this.getTaste();
        }

    }
}
