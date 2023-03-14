package com.javarush.Level_Core_12;

public class Sol_12_14 {

    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void run() {
            super.run();
        }

        @Override
        public void fly() {

        }
    }
}



