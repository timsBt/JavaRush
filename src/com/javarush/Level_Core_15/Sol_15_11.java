package com.javarush.Level_Core_15;

import java.util.HashMap;
import java.util.Map;

public class Sol_15_11 {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put(23.9,"Двадцать три и 9");
        labels.put(23.1,"Двадцать три и 1");
        labels.put(23.2,"Двадцать три и 2");
        labels.put(23.3,"Двадцать три и 3");
        labels.put(23.4,"Двадцать три и 4");
    }


}
