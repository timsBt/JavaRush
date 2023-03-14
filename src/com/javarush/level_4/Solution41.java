package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution41 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String v = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        int c = Integer.parseInt(v);

        if (a==b && b!=c)
            System.out.println(a + " " + b);
        else if (b==c && c!=a)
            System.out.println(b +  " " + c);
        else if (c==a && b!=c)
            System.out.println(c +  " " + a);
        else if (a==b && b==c)
            System.out.println(a + " " +  b + " " +c);

    }
}