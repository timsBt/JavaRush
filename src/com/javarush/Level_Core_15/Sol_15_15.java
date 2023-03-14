package com.javarush.Level_Core_15;

public class Sol_15_15 {

    public static Cat cat;


    public static void main(String[] args) {

    }

    public static class Cat {
       public String name;
    }

    static {
        Cat cat1 = new Cat();
        cat = cat1;
        cat.name = "Barsic";
        System.out.println(cat.name);
    }


}
