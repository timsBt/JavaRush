package com.javarush.Level_Core_13;

public class Sol_13_12 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        void getColor();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}

