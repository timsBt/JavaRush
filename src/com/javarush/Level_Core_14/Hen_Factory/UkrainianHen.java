package com.javarush.Level_Core_14.Hen_Factory;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}