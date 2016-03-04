package ua.kushnirenko.singleton.chocolate.factory;

public class ChocolateBoiler {

    /**
     * ChocolateBoiler is always needed in working process,
     * so the best way to provide thread safety - using mandatory initialization.
     */
    private static ChocolateBoiler instance = new ChocolateBoiler();

    private boolean isBoiled;

    private boolean isEmpty;

    public boolean isBoiled() {
        return isBoiled;
    }

    public void setIsBoiled(boolean isBoiled) {
        this.isBoiled = isBoiled;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    private ChocolateBoiler() {
        isBoiled = false;
        isEmpty = true;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("Filled the boiler...");
            setIsEmpty(false);
            return;
        }
        System.out.println("Cannot fill the boiler - it`s full!");
    }

    public void boil() {
        if (!isEmpty() && !isBoiled) {
            System.out.println("Boilling...");
            setIsBoiled(true);
            return;
        }
        System.out.println("Cannot boil substance!");
    }

    public void drain() {
        if (isBoiled()) {
            System.out.println("Drain hot substance!");
            setIsEmpty(true);
            setIsBoiled(false);
        }
        System.out.println("Cannot drain substance!");
    }

}
