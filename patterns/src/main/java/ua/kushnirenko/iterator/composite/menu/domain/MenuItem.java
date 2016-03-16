package ua.kushnirenko.iterator.composite.menu.domain;


/**
 * This class is a 'leaf', ( it can't have any child ) so it doesn't override
 * methods:
 * add(MenuComponent menuComponent),
 * remove(MenuComponent menuComponent),
 * getChild(int i) from superclass.
 * So, when any of these methods will called - the new UnsuppoertedOperation will be thrown.
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (isVegetarian() != menuItem.isVegetarian()) return false;

        if (Double.compare(menuItem.getPrice(), getPrice()) != 0) return false;

        if (getName() != null ?
                !getName().equals(menuItem.getName()) :
                menuItem.getName() != null) return false;

        return !(getDescription() != null ?
                !getDescription().equals(menuItem.getDescription()) :
                menuItem.getDescription() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (isVegetarian() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toPrint() {
        return "MenuItem{" +
                "\nname='" + name + '\'' +
                ",\ndescription='" + description + '\'' +
                ",\nvegetarian=" + vegetarian +
                ",\nprice=" + price +
                "\n}";
    }
}
