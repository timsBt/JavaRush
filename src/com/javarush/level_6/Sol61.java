package com.javarush.level_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sol61 {
    public static String readString() throws Exception {
//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
    }

    public static int readInt() throws Exception {
//напишите тут ваш код
        Scanner scaner = new Scanner(System.in);
        int b = scaner.nextInt();
        return b;


    }

    public static double readDouble() throws Exception {
//напишите тут ваш код
        Scanner scaner = new Scanner(System.in);
        double b = scaner.nextDouble();
        return b;

    }

    public static boolean readBoolean() throws Exception {
//напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.nextBoolean();
        return b;

    }

    public static void main(String[] args) throws Exception {

    }
}