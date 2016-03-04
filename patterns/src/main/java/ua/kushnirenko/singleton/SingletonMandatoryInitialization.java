package ua.kushnirenko.singleton;

public class SingletonMandatoryInitialization {

    private static SingletonMandatoryInitialization instance = new SingletonMandatoryInitialization();

    private SingletonMandatoryInitialization() {
    }

    public static SingletonMandatoryInitialization getInstance() {
        return instance;
    }


}
