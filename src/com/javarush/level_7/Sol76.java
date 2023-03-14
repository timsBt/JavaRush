package com.javarush.level_7;

import java.util.ArrayList;

public class Sol76 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("tree");
        list.add("four");
        list.add("five");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
