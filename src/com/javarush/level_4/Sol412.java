package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol412 {
//ВВЕЛИ 2 ЧИСЛА И НАРИСОВАЛИ ТРЕУГОЛЬНИК РАЗМЕРО m НА n
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++){
            for (int x = 0; x < n; x++){
                System.out.print(8);
            }
            System.out.println();
        }

    }
}