package com.javarush.Sbor_klassov;
public class Cat1
{

   private static int catCount = 0;

    public Cat1(){
        Cat1.catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat1.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}