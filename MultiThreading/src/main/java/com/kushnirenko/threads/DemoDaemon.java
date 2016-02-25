package com.kushnirenko.threads;

public class DemoDaemon extends Thread {

    int val = 0;

    @Override
    public void run() {
        System.out.println(isDaemon() ? "Daemon starts." : "Ordinary Thread Starts.");
        while (!isInterrupted() && val < 50) {
            try {
                sleep(500);
                val++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(isDaemon() ? "Daemon interrupted. Value: " + val : "Ordinary thread interrupted. Value: " + val);
    }

    @Override
    public void interrupt() {
        System.out.println(isDaemon() ? "Daemon interrupted. Value: " + val : "Ordinary thread interrupted. Value: " + val);
        super.interrupt();
    }

    public static void main(String[] args) {
        DemoDaemon dm1 = new DemoDaemon();
        DemoDaemon dm2 = new DemoDaemon();
        dm1.setDaemon(true);
        dm1.start();
        dm2.start();
        for (int i = 0; i < 10; i++) {
            try {
                currentThread().sleep(1000);
                System.out.print("#");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nInterrupting current thread.");
        currentThread().interrupt();
        System.out.println("Is main thread alive ? - " + currentThread().isAlive());

    }

}
