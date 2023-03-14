package com.javarush.level_9;

public class Sol96 {

    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {

        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        int x = methods.length;
        System.out.println(x);
        return x;



    }
}



