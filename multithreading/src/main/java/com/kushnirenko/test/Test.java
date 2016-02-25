package com.kushnirenko.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 15.02.16
 */
public class Test {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int listLength = 5;
        ArrayList<Integer> list = new ArrayList<>(listLength);
        for (int i = 0; i < listLength; i++) {
            list.add(randomGenerator.nextInt(20));
        }

        System.out.println("List :" + list + "\n*******");

        int midstIdx = list.size() / 2 + 1;

        System.out.println("Midst idx: " + midstIdx);

        int minIdx = randomGenerator.nextInt(midstIdx);
        System.out.println("Min idx: " + minIdx);
        int maxIdx = randomGenerator.nextInt(midstIdx) + midstIdx;
        System.out.println("Max idx: " + maxIdx);

        Timestamp date1 = new Timestamp(System.currentTimeMillis());
        Timestamp date2 = new Timestamp(System.currentTimeMillis() + 1000);
        System.out.println("DATE_1: " + date1);
        System.out.println("DATE_2: " + date2);
        System.out.println(date2.after(date1));

    }

}
