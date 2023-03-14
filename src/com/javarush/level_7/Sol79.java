package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol79 {

    public static void main(String[] args) throws IOException {


        int [] mas = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
        int sumchet = 0;
        int sumhren = 0;
        for (int i = 0; i < mas.length; i++){
            if (i % 2 == 0)
                sumchet += mas[i];
            else
                sumhren += mas[i];
        }
        if (sumchet > sumhren)
        System.out.println("В домах с четными номерами проживает больше жителей."+ sumchet );
        else if (sumhren > sumchet)
        System.out.println("В домах с нечетными номерами проживает больше жителей." + sumhren);

    }
}