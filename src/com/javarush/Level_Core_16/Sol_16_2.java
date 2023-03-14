package com.javarush.Level_Core_16;

public class Sol_16_2 {
    public static void main(String[] args) {
    TestThread thread = new TestThread();
       thread.start();
    }
public static class TestThread extends java.lang.Thread{
   static  {
        System.out.println("it's a static block inside TestThread");
    }

    @Override
    public void run() {
        System.out.println("it's a run method");
    }
}
}

