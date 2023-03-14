package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String v = reader.readLine();
        String x = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        int c = Integer.parseInt(v);
        int d = Integer.parseInt(x);

        if ( a >= b && a >= c && a >= d )
            System.out.println(a);
        if ( b > a && b >= c && b >= d )
            System.out.println(b);
        if ( c > a && c > b && c >= d )
            System.out.println(c);
        if ( d > a && d > b && d > c )
            System.out.println(d);







    }
}