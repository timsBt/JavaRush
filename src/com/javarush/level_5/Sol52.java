package com.javarush.level_5;

public class Sol52 {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Liliya",18);
    }

    static class Person {

        String name;
        int age;

        public void initialize (String name,int age){
            this.name = name;
            this.age = age;

        }



    }




}
