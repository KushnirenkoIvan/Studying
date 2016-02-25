package com.kushnirenko.threads;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Класс демонстрирует работу потоков, создаёт один поток, из него другой поток,
 * после останавливает поток descend, пока descend child продолжает работу.
 */
public class TestDemo implements Runnable {

    private static SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
    public final Thread thread;

    public TestDemo() {
        thread = new Thread(this, "descendant");
    }

    @Override
    public void run() {
        System.out.println("Descendant starts: " + thread + " at " + new SimpleDateFormat("hh:mm:ss").format(new Date(System.currentTimeMillis())));
        new Thread() {
            @Override
            public void run() {
                System.out.println("Descendant Child was started at: " + new SimpleDateFormat("hh:mm:ss").format(new Date(System.currentTimeMillis())));
                for (int i = 20; i > 0; i--) {
                    try {
                        System.out.println("descendantChild: " + i);
                        currentThread().sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("descendant is interrupted at " +
                                new SimpleDateFormat("mm:ss").format(new Date(System.currentTimeMillis())));
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        try {
            thread.sleep(1500);
            System.out.println("descendant trying to interrupt.");
            return;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        td.run();
        System.out.println(td.thread.isAlive() ? "descendant alive" : "descendant is interrupted.");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
