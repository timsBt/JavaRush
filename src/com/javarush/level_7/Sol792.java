package com.javarush.level_7;

import java.util.ArrayList;

public class Sol792 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
