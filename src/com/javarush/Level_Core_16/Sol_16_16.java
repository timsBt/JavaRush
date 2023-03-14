package com.javarush.Level_Core_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol_16_16 {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
//create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
//read a string
        reader.readLine();
        stopwatch.interrupt();
//close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
//add your code here - добавьте код тут
                while(!currentThread().isInterrupted()){
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }

}
