package com.javarush.Level_Core_13;

public class Sol_13_14 {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public static class Cat implements Movable,Eat,Edible{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }

        @Override
        public void beEaten() {

        }
    }

    public static class Mouse implements Movable,Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    public static class Dog implements Movable,Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

}
