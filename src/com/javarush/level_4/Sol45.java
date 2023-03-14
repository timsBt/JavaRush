package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol45 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String t = reader.readLine();
        String v = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        int c = Integer.parseInt(v);

        if ( a == b && a != c)
            System.out.println("3");
       if ( a == c && a != b)
            System.out.println("2");
     if ( b == c && b != a)
            System.out.println("1");




    }
}