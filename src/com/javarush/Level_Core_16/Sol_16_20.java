package com.javarush.Level_Core_16;

import java.util.ArrayList;
import java.util.List;

public class Sol_16_20 {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
//add your code here - добавь код тут
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).interrupt();
        }

    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
//fix 2 variables - исправь 2 переменных
            Thread current = Thread.currentThread();
            boolean isCurrentThreadInterrupted = current.isInterrupted();
            String threadName = current.getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}

