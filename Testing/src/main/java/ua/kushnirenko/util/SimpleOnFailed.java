package ua.kushnirenko.util;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 10.02.16
 */

public class SimpleOnFailed extends TestWatcher {


    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public SimpleOnFailed() {
    }

    public SimpleOnFailed(String info) {
        this.setInfo(info);
    }

    @Override
    protected void failed(Throwable e, Description description) {
        printMsg();
    }

    private void printMsg() {
        if (info != null) {
            System.out.println(info);
        } else {
            System.out.println("There is no information...");
        }
    }

    @Override
    protected void starting(Description description) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        if (stack.length > 0)
            System.out.println("Test: " + stack[3].getClassName() + ""
                    + stack[3].getMethodName() + " starts.");
        super.starting(description);
    }

    @Override
    protected void finished(Description description) {

        super.finished(description);
    }
}
