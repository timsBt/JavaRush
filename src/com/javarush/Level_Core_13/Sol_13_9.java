package com.javarush.Level_Core_13;

public class Sol_13_9 {
    public static void main(String[] args) {

    }
    interface CanMove{
        Double speed();

    }

    interface CanFly extends CanMove{
        Double speed(CanFly fly);
    }



}
