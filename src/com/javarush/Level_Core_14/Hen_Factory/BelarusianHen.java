package com.javarush.Level_Core_14.Hen_Factory;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}