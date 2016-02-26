package ua.kushnirenko.util;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * This class is so simple, so we don't need to write something here)
 */
@Component
public class CalculatorUtil {

    public static Logger log = Logger.getLogger(CalculatorUtil.class);

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

}
