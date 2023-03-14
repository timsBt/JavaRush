package com.javarush.Level_Core_14.Hen_Factory;

 public abstract class Hen {

    abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица";
    }
}

