package com.javarush.level_8;

import java.util.HashSet;
import java.util.Set;

public class Sol85 {
    public static Set<String> createSet(){

        Set<String > set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            set.add("Л"+ i);

        }
        for (String text : set)
        {
            System.out.println(text);
        }
  return set;


    }

    public static void main(String[] args) {

       createSet();

    }
}
