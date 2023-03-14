package com.javarush.Level_Core_14.Hen_Factory;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
