package ua.kushnirenko.util;

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

    @Rule
//    public SimpleOnFailed ruleExample = new SimpleOnFailed();
    public SimpleOnFailed ruleExample;

    @Test
    public void shouldPass() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[stackTraceElements.length - 1];
        String testMethodInfo = element.getClassName() + ":" + element.getMethodName();
        ruleExample = new SimpleOnFailed(testMethodInfo);
        assertTrue(false);
    }
}