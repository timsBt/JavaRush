package com.javarush.level_5;

public class Sol5 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya",5,2,3);
        Cat cat2 = new Cat("Vasya1",4,3,4);
        Cat cat3 = new Cat("Vasya2",6,3,4);

//напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}







