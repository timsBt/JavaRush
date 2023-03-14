package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol44 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String name = reader.readLine();
        String age = reader.readLine();
        int x = Integer.parseInt(age);

        if (x < 18)
            System.out.println("Подрасти еще");

    }
}