package com.javarush.Level_Core_12;

public class Sol_12_4 {
// 3 способа возвращения минимального значаения
    public static void main(String[] args) {

    }

    public static int min(int a,int b){

        if (a < b)
            return a;
        else
            return b;
    }
    public static long min(long a,long b){

        return Math.min(a,b);
    }
        public static double min(double a,double b){

       return a < b ? a : b;
    }




}
