package ua.kushnirenko.duck.entity.domain;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public abstract class Duck {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
