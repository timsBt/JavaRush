package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol420 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if (year%400 == 0)
        System.out.println("количество дней в году:366");
        else if (year%100 == 0)
            System.out.println("количество дней в году:365");
        else if (year%4 == 0)
            System.out.println("количество дней в году:366");
        else
            System.out.println("количество дней в году:365");



    }
}
