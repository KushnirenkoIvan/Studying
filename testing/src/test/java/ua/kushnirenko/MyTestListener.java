package ua.kushnirenko;

import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * This class customize ordinary JUnit RunListener.
 */
public class MyTestListener extends RunListener {

    private static final Logger log = Logger.getLogger("ua.kushnirenko.util.TESTListenerLOGGER");

    @Override
    public void testStarted(Description description) {
        log.info("Test started: " + description.getDisplayName());
    }

    @Override
    public void testFailure(Failure failure) {
        if (log.isDebugEnabled()) {
            log.debug("Test FAILED: " + failure.getDescription().getDisplayName() + " [" + failure.getMessage() + "] ");
        }
    }

    @Override
    public void testFinished(Description description) throws Exception {
        log.info("Test finished: " + description.getDisplayName());
    }
}
