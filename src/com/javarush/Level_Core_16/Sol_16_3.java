package com.javarush.Level_Core_16;

import java.util.ArrayList;
import java.util.List;

public class Sol_16_3 {

    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
//Add your code here - добавьте свой код тут
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }

}
