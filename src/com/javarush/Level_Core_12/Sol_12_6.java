package com.javarush.Level_Core_12;

public class Sol_12_6 {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanRun,CanSwim{

    }

    public interface CanRun{
        public void run();
    }
    public interface CanSwim{
        public void swim();
    }





}
