package ua.kushnirenko.util;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 25.01.16
 */
public class MyTestRunner extends Runner {
    @Override
    public Description getDescription() {
        return null;
    }

    @Override
    public void run(RunNotifier runNotifier) {

    }
}
