package com.javarush.Level_Core_14.Hen_Factory;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}