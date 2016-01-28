package com.kushnirenko.threads;


import java.util.ArrayList;
import java.util.Random;

public class FindUtil {

    static public ArrayList<Integer> fillList(int listSize) {
        ArrayList<Integer> list = new ArrayList<Integer>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(new Random().nextInt(10));
        }
        System.out.println(list);
        return list;
    }


    public static void main(String[] args) {

    }

}







