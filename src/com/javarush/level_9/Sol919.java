package com.javarush.level_9;

public class Sol919 {

    public static void main(String[] args) {

        try {
            divideByZero();
        }
        catch (Exception e){
        e.printStackTrace();
        }


    }

    public static  void divideByZero(){
        int x = 9/0;
        System.out.println(x);
    }
}
