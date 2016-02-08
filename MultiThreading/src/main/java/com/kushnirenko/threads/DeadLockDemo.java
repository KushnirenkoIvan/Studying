package com.kushnirenko.threads;

/**
 * Demonstration of deadlock situation using Tester and Container classes.
 *
 * @author ivan kushnirenko
 * @version 1.0
 * @date 15.01.16
 * @see Container
 */
public class DeadLockDemo {


    public static void main(String[] args) {
        Container con1 = new Container();
        Container con2 = new Container();

        Thread tcw1 = new Thread(new ThreadContainerWorker(con1, con2));
        Thread tcw2 = new Thread(new ThreadContainerWorker(con2, con1));

        tcw1.start();
        tcw2.start();
    }

}





