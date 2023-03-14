package com.javarush.level_10;

import java.util.StringTokenizer;

public class Sol_10_1 {
    public static void main(String[] args) {

    }

    public static class Human {
       private String name;
       private int age;
       private int height;
       private int weight;
       private String hair;
       private String eyes;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name,int age,int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name,int age,int height,int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;

        }

        public Human(String name,int age,int height,int weight,String hair) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.hair = hair;
        }

        public Human(String name, int age, int height, int weight, String hair,String eyes) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.hair = hair;
            this.eyes = eyes;
        }

        public Human(String name, String hair) {
            this.name = name;
            this.hair = hair;
        }


        public Human(String name, String hair,String eyes) {
            this.name = name;
            this.hair = hair;
            this.eyes = eyes;
        }


        public Human(int age,int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age,int height,int weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }



    }
}
