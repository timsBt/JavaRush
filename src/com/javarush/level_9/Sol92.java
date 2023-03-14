package com.javarush.level_9;

public class Sol92 {


    public static void main(String[] args) {

        System.out.println("Metod 1 vernul: "+ method1());


    }

    public static String method1() {

        System.out.println("Metod 2 vernul: "+ method2());
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getMethodName();

    }

    public static String method2() {
        method3();
        System.out.println("Metod 3 vernul: "+ method3());
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getMethodName();

    }

    public static String method3() {
        method4();
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getMethodName();

    }

    public static String method4() {
        method5();
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        return methods[2].getMethodName();
    }
}

