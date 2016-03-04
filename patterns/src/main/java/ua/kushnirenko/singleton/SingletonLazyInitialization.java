package ua.kushnirenko.singleton;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {
    }

    public static synchronized SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

}
