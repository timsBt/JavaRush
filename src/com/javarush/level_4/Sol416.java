package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol416 {
// ВВОДИМ ЧИСЛА И ВЫВОДИМ КОЛИЧЕСТВО ОТРИЦАТЕЛЬНЫЙ И ПОЛОЖИТЕЛЬНЫЕ ЧИСЛА
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int count = 0;
        int otriz = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        if (a < 0) otriz++;
        if (b < 0) otriz++;
        if (c < 0) otriz++;

        System.out.println("количество отрицательных чисел: " + otriz);
        System.out.println("количество положительных чисел: " + count);



    }
}