package com.kushnirenko.threads;


public class RunnableClass implements Runnable {

    public Thread currentThread;

    private boolean interrupted = false;

    public RunnableClass() {
        currentThread = new Thread(this, "default");
    }

    @Override
    public void run() {
        while (!interrupted) {
            System.out.println();
        }
    }

}


