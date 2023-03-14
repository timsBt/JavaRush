package com.javarush.Level_Core_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sol_15_12 {
    public static int A;
    public static int B;

    static {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String a = reader.readLine();
                String b = reader.readLine();
                A = Integer.parseInt(a);
                B = Integer.parseInt(b);
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}



