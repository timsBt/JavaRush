package com.javarush.Level_Core_15.task1530;

public abstract class DrinkMaker {
   abstract void getRightCup();
   abstract void putIngredient();
   abstract void pour();

   void makeDrink(){
       getRightCup();
       putIngredient();
       pour();
   }
}
