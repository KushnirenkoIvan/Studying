package ua.kushnirenko.util;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Simple test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalculatorUtil.class)
public class CalculatorUtilTest extends TestCase {

    @Autowired
    private CalculatorUtil calculatorUtil;

    final static Logger log = Logger.getLogger("ua.kushnirenko.util.TESTLOGGER");

    @Rule
    public SimpleOnFailed simpleOnFailed = new SimpleOnFailed();

    @Test
    public void testSum() {
        for (int i = 0; i < 6; i++) {
            NDC.push("Test iteration :" + i);
            int sum = calculatorUtil.sum(0, i);
            assertEquals("ERROR: ", sum, i);
            log.info("Tested case: " + 0 + " + " + i + " = " + sum);
            NDC.pop();
        }
        NDC.clear();
    }

    /*
      You need to start with this method for applying custom listener.

    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new MyTestListener());
        core.run(CalculatorUtilTest.class);
    }
    */

}