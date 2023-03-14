package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sol7990 {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> strings = new ArrayList<String>();

    while (true) {
        String string = reader.readLine();
        if (string == null || string.isEmpty()) break;
        strings.add(string);
    }

    ArrayList<String> resultStrings = new ArrayList<String>();

    for (int i = 0; i < strings.size(); i++) {
        int a = strings.get(i).length();
        String x = strings.get(i);
       if (a % 2 == 0 )
           resultStrings.add(x+ " " + x);
       else
           resultStrings.add(x + " " + x +  " " + x);
    }

    for (int i = 0; i < resultStrings.size(); i++) {
        System.out.println(resultStrings.get(i));
    }
}
}