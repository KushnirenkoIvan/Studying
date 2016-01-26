package ua.kushnirenko.util;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 25.01.16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalculatorUtil.class)
public class CalculatorUtilTest extends TestCase {

    @Autowired
    private CalculatorUtil calculatorUtil;

    final static Logger log = Logger.getLogger(CalculatorUtilTest.class);

    @Test
    public void testSum() {
        for (int i = 0; i < 6; i++) {
            int sum = calculatorUtil.sum(0, i);
            log.info("sum: = " + sum);
            assertEquals("Not expect!", sum, i);
        }
    }

}