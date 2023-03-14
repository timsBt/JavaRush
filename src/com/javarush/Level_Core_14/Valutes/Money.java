package com.javarush.Level_Core_14.Valutes;

public abstract class Money {
    private double amount;


    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();

}


