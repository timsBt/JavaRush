package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol794 {
    //САМАЯ ДЛИННАЯ СТРОКА
    private static ArrayList<String> strings;
    public static void main(String[] args) throws IOException {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int x = strings.get(0).length();

        for(int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() > x)
                x = strings.get(i).length();

        for (int i = 0; i < strings.size(); i++)
        if (strings.get(i).length() == x)
            System.out.println(strings.get(i));
    }
}