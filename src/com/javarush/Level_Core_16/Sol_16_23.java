package com.javarush.Level_Core_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol_16_23 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
//add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        String a = "";
        String b = "";
        String c = "";

        @Override
        public void run() {
            try {
                a = reader.readLine();
                b = reader.readLine();
                c = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public void printResult(){
            System.out.println(a + " " + b + " " + c);
        }
    }

//add your code here - добавьте код тут


}
