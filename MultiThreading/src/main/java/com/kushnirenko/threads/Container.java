package com.kushnirenko.threads;

import org.apache.log4j.Logger;

/**
 * Trivial container class contains some val and synchronized methods for working with it.
 *
 * @author ivan kushnirenko
 * @version 1.0
 * @date 15.01.16
 */

public class Container {

    private static Logger log = Logger.getLogger(Container.class);

    public static final int DEFAULT_VALUE = 0;

    private int val;

    public Container() {
        val = DEFAULT_VALUE;
        log.info("New Container was created, value set up to default: val = 0.");
    }

    public Container(int val) {
        this.val = val;
        log.info("New Container was created, value set up to: " + val + ".");
    }

    public synchronized int getVal() throws InterruptedException {
        Thread.currentThread().sleep(2000);
        return val;
    }

    public synchronized void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Container{" +
                "val=" + val +
                '}';
    }

}
