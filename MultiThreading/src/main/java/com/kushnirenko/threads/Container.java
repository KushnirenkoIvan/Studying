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
        log.info("New Container was created, value set up to default.");
    }

    public Container(int val) {
        this.val = val;
        log.info("New Container was created, value set up to: " + val + ".");
    }

    public synchronized int getVal() {
        return val;
    }

    public synchronized void setVal(int val) {
        this.val = val;
    }


    public synchronized Boolean equal(Object obj) {

        Container con = null;
        try {
            con = (Container) obj;
        } catch (ClassCastException exp) {
            log.error("Cannot cast " + obj.getClass() + " to Container.class;");
            log.error("Comparison failed, return null.");
            return null;
        }
        //This delay modelling hard comparison and need to emergence deadlock situation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exp) {
            log.warn("Container comparison is interrupted!");
            log.info(exp.getStackTrace());
        }
        log.info("Comparison success!");
        return val == con.getVal();
    }

}
