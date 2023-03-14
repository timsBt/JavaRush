package com.javarush.Level_Core_16;

public class Sol_16_18 {
    public static void main(String[] args) throws InterruptedException {
//Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        Thread teThread = new Thread(testThread);
        testThread.start();

        testThread.interrupt();

    }

    //Add your code below - добавь код ниже


    public static class TestThread extends Thread{

        @Override
        public void run() {

        }
    }
}

