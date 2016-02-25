package ua.kushnirenko.util;

import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 10.02.16
 */
@ContextConfiguration(classes = SimpleOnFailed.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleRuleExampleTest {

    private static Logger log = Logger.getLogger("TESTListenerLOGGER");

    @Rule
    public SimpleOnFailed ruleExample = new SimpleOnFailed();

    @Test
    public void shouldPass() {
        log.trace("Should pass method starts...");
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[stackTraceElements.length - 1];
        String testMethodInfo = element.getClassName() + ":" + element.getMethodName();
        log.warn("Be careful...");
        log.debug("not bad... I think, i can do it.");
        assertTrue(true);
        log.info("Test successfully passed.");
    }
}