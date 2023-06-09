package com.javarush.Level_Core_12;

public class Sol_12_10 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman,Worker,Secretary{

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}

