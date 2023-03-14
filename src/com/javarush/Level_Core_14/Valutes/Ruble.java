package com.javarush.Level_Core_14.Valutes;

public class Ruble extends Money{
    @Override
    public String getCurrencyName() {
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
