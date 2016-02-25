package com.kushnirenko.threads;


/**
 * Класс показывает работу потоков с разными приоритетами.
 * Приоритет потоков не влияет на процессорное время, выделяемое потоку.
 */

public class PriorityDemo extends Thread {

    private int count;

    public PriorityDemo(String name, int priority) {
        super(name);
        this.setPriority(priority);
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            count++;
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupts.");
//                e.printStackTrace();
            }
        }
    }

    @Override
    public void interrupt() {
        System.out.println(this.getName() + " has been counted: " + count);
        super.interrupt();
    }

    public static void main(String[] args) {
        PriorityDemo first = new PriorityDemo("with low priority", 3);
        PriorityDemo second = new PriorityDemo("with high priority", 7);
        first.start();
        second.start();
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        first.interrupt();
        second.interrupt();
        Thread.currentThread().interrupt();
    }
}
