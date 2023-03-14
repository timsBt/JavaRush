package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol798 {


    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 4; i >= 0; i--){
            System.out.println(list.get(i));
        }




    }
}