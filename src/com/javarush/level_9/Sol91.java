package com.javarush.level_9;

public class Sol91 {public static void main(String[] args) {
    method1();
}

    public static StackTraceElement[] method1() {
        method2();
//напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
      return stackTraceElements;

    }

    public static StackTraceElement[] method2() {
        method3();
//напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements;
//напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
//напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements;
    }

    public static StackTraceElement[] method5() {
//напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}

