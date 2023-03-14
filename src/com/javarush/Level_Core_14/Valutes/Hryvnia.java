package com.javarush.Level_Core_14.Valutes;

public class Hryvnia extends Money{
    @Override
    public String getCurrencyName() {
        return "UAH";
    }
    public Hryvnia(double amount){
        super(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
