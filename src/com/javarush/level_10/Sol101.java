package com.javarush.level_10;

public class Sol101 {

    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);


        System.out.println(b);
    }

}
