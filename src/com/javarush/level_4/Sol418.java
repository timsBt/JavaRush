package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol418 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        if (a.equals(b)){
            System.out.println("Имена идентичны");
        }
        else if (!a.equals(b) && a.length()==b.length()){
            System.out.println("Длины имен равны");
        }
    }
}
