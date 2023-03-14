package com.javarush.level_9;

public class Sol93 {
    public static void main(String[] args) {
        System.out.println("Metod 1 vernul: "+ method1());
    }

    public static int method1() {

        System.out.println("Metod 2 vernul: "+ method2());
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getLineNumber();
    }

    public static int method2() {

        System.out.println("Metod 3 vernul: "+ method3());
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getLineNumber();
    }
}

