package ua.kushnirenko.duck.entity.domain;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 16.02.16
 */
public abstract class AnthropogenicDuck extends Duck {

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "AnthropogenicDuck{" +
                "material='" + material + '\'' +
                ", " + super.toString() + " }";
    }
}
