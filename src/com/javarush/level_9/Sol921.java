package com.javarush.level_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sol921 {
    public static void main(String[] args) {


        readData();


    }


    public static void readData() {
        ArrayList<Integer> list = null;
        try {
            list = new ArrayList<Integer>();
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (Exception e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

}
