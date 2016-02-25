package com.kushnirenko.memory;

public class StackOverflowDemo {

    public static int recursion(int val) {
        System.out.println(val);
        return recursion(++val);
    }

    public static void main(String[] args) {
        recursion(0);
    }

}
