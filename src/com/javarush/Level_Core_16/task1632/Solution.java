package com.javarush.Level_Core_16.task1632;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new OneThread()));

    }

    public static void main(String[] args) {

    }

    public static class OneThread extends Thread{
        @Override
        public void run() {
            while (true){
            }
        }
    }

    public static class TwoThread extends Thread{
        @Override
        public void run() {

            }
        }
    }



