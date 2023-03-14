package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Sol74 {
    public static void main(String[] args) throws IOException {

        int [] mas = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }

        int [] ten = new int[10];
        int [] twoten = new int[10];

        ten = Arrays.copyOf(mas,10);
        twoten = Arrays.copyOfRange(mas,10,20);

        for(int i = 0; i < twoten.length; i++){
            System.out.println(twoten[i]);
        }



    }
}
