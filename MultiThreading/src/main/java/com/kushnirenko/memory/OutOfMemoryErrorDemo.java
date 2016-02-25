package com.kushnirenko.memory;

import java.util.LinkedList;

public class OutOfMemoryErrorDemo {


    public static LinkedList<OutOfMemoryErrorDemo> objectLinks = new LinkedList<>();


    public static void main(String[] args) {
        while (true) {
            objectLinks.add(new OutOfMemoryErrorDemo());
            System.out.println(objectLinks.size());
        }
    }

}
