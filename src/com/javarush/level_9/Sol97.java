package com.javarush.level_9;

public class Sol97 {

    public static void main(String[] args) {


        try {

            int a = 42 / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
