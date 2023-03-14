package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution42 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String v = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        int c = Integer.parseInt(v);

        if ((a + b) > c && (a + c) > b  && (b + c) > a )
            System.out.println("Треугольник существует");
         else
             System.out.println("Треугольник не существует");




    }
    }
