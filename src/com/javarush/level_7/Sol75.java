package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol75 {

    public static void main(String[] args) throws IOException {


        String[] stroki = new String[10];
        int[] chislo = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            stroki[i] = reader.readLine();
        }
        for(int i = 0; i < 10; i++){
            chislo[i] = stroki[i].length();
        }
        for(int i = 0; i < 10; i++){
            System.out.println(chislo[i]);
        }



    }
}
