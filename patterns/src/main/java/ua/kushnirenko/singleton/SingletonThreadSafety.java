package ua.kushnirenko.singleton;

public class SingletonThreadSafety {

    private static volatile SingletonThreadSafety instance;

    private SingletonThreadSafety() {
    }

    public static SingletonThreadSafety getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafety.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafety();
                }
            }
        }
        return instance;
    }
}
