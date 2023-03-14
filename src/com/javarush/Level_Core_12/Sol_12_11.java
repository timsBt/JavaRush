package com.javarush.Level_Core_12;

public class Sol_12_11 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Avto implements Businessman {

    }

    public static class Avto {
        public void workHard() {

        }
    }
}

