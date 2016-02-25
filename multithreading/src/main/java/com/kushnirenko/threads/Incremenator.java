package com.kushnirenko.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Incremenator extends Thread {

    private static volatile int programValue;

    public static int getProgramValue() {
        return programValue;
    }

    private volatile boolean incrementFlag;

    public boolean isIncrementFlag() {
        return incrementFlag;
    }

    public void setIncrementFlag(boolean incrementFlag) {
        System.out.println("\n" + "increment flag was set to: " + incrementFlag);
        this.incrementFlag = incrementFlag;
    }

    public Incremenator() {
        programValue = 0;
        incrementFlag = true;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.print(getProgramValue());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Incremenator interrupted.");
                break;
            }
            if (incrementFlag) {
                programValue++;
            } else {
                programValue--;
            }
            System.out.print(" ");
        }
        System.out.println("Incremenator finished with value : " + getProgramValue() + ".");
    }


    public static void sleep(long millis) throws InterruptedException {
        long start = 0;
        try {
            start = System.currentTimeMillis();
            Thread.currentThread().sleep(millis);
        } catch (InterruptedException exp) {
            System.out.println("\n" + "Sleeping is interrupted after: " + new SimpleDateFormat("SSS").format(new Date(System.currentTimeMillis() - start)) + "/500 ms.");
            throw exp;
        }
    }

    public static void main(String[] args) {
        Incremenator inc = new Incremenator();
        inc.start();
        try {
            currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inc.setIncrementFlag(false);
        try {
            currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inc.interrupt();
    }

}
