package com.javarush.Sbor_klassov;

public class Friend {
    String name;
    int age;
    char sex;

    public Friend(String name) {
        this.name = name;
    }
    public Friend(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Friend(String name,int age,char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
