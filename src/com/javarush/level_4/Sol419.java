package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol419 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a%2 == 0 && a < 0)
            System.out.println("отрицательное четное");
        else if (a%2 != 0 && a < 0)
            System.out.println("отрицательное нечетное");
        else if (a == 0)
            System.out.println("ноль");
        else if (a%2 == 0 && a > 0)
            System.out.println("положительное четное");
        else if (a%2 != 0 && a > 0)
            System.out.println("положительное нечетное");

    }
}
