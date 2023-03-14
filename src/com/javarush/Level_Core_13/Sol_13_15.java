package com.javarush.Level_Core_13;

public class Sol_13_15 {

    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";
        void onPress();
        String onPress(Object o);
    }
}

