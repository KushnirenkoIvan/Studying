package ua.kushnirenko.factory.simple.pizza;

public abstract class Pizza {

    private double price;

    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void prepare() {
        System.out.println("your pizza is prepared!");
    }

    public void bake() {
        System.out.println("Ypu pizza is backed!");
    }

    public void cut() {
        System.out.println("Cutting your pizza...");
    }

    public void box() {
        System.out.println("Boxing your pizza!");

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


