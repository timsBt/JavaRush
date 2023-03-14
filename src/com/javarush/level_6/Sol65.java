package com.javarush.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sol65 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int [] mas = new int[5];
       for(int i=0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for(int i=0; i < mas.length; i++) {
            Arrays.sort(mas);
            System.out.println(mas[i]);
        }



    }



}
