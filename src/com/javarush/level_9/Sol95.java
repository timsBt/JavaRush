package com.javarush.level_9;

public class Sol95 {
    public static void main(String[] args) {
        log("In main method");
    }
        public static void log(String text){

            StackTraceElement[] methods = Thread.currentThread().getStackTrace();

                System.out.println(methods[2].getClassName()+": " + methods[2].getMethodName() + ": " + text);




        }
    }

