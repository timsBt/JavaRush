package com.javarush.Level_Core_14.Valutes;

public class USD extends Money{

      @Override
    public String getCurrencyName() {
        return "USD";
    }


      public USD(double amount) {
          super(amount);
      }

    @Override
    public double getAmount() {
        return super.getAmount();
    }


}
