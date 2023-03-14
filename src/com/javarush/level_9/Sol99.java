package com.javarush.level_9;

public class Sol99 {
    public static void main(String[] args) {
        int [] m = new int[2];

        try {

            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


    }


}
