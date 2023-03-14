package com.javarush.Level_Core_16;

public class Sol_16_19 {
    public static boolean Cancel = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();


    }

    public static void ourInterruptMethod() {
        Cancel = false;

    }

    public static class TestThread implements Runnable {


        public void run() {
            while (Cancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);


                } catch (InterruptedException e) {



                }
            }
        }
    }
}
