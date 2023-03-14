package com.javarush.Level_Core_16;

public class Sol_16_17 {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
//add your code here - добавь код тут

        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
//add your code here - добавь код тут

            try {
                while (numSeconds >= 1) {
                    System.out.println(numSeconds--);
                    Thread.sleep(1000);
                }
                System.out.println("Марш!");
            }
                catch (InterruptedException e) {
                    System.out.println("Прервано!");
            }
        }
    }
}

