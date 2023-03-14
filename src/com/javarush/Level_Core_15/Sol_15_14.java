package com.javarush.Level_Core_15;

public class Sol_15_14 {
    public static int A = 0;



    static {
//throw an exception here - выбросьте эксепшн тут

        int x = 1/0;

    }



    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

