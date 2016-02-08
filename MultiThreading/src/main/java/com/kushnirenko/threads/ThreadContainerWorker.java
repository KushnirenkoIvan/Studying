package com.kushnirenko.threads;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 01.02.16
 */
public class ThreadContainerWorker implements Runnable {

    private static Logger log = Logger.getLogger("kushnirenko.threads");

    static final int DEFAULT_WORKER_ID = 1;

    private Container con1;
    private Container con2;
    private int id;

    public ThreadContainerWorker(Container con1, Container con2) {
        this.con1 = con1;
        this.con2 = con2;
        log.info("New container worker was created.");
    }

    @Override
    public void run() {
        NDC.push(Thread.currentThread().getName());
        try {
            log.info("Get value from " + con1);
            int val1 = con1.getVal();
            log.info("Comparing: ");
            log.info(val1 == con2.getVal() ? " equal values. " : "not equal.");
        } catch (InterruptedException exp) {
            log.debug("Cannot get value from: " + con1, exp);
        }
    }


}
