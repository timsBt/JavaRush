package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol73 {
    public static void main(String[] args) throws IOException {
        int[] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >= 0; i--){
            System.out.println(list[i]);
        }






    }
}
