package ua.kushnirenko.util;

import org.apache.log4j.Logger;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 25.01.16
 */
public class CalculatorUtil {

    public static Logger log = Logger.getLogger(CalculatorUtil.class);

    public static int sum(int a, int b) {
        int result = a + b;
        log.info("Sum: " + a + " + " + b + " = " + result + ".");
        return result;
    }

}
