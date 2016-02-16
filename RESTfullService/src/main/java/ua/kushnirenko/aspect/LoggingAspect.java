package ua.kushnirenko.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 09.02.16
 */
@Aspect
public class LoggingAspect {

    @Before("execution(* ua.kushnirenko.rest.controller.MainControllerImpl.*())")
    public void logMethodExecution(JoinPoint jp) {
        System.out.println("AOP logging -> "
                + jp.toShortString());
    }
}
