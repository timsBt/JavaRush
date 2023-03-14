package com.javarush.Level_Core_14;

public class Sol_14_8 {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        @Override
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal{
        @Override
        public void swim() {
            super.swim();
        }

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Whale extends OceanAnimal {
        @Override
        public void swim() {
            super.swim();
        }

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Otter implements Walkable,Swimmable {
        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }


}



