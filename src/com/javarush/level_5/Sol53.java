package com.javarush.level_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol53 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int sum =0;


        while (true) {
          int x = Integer.parseInt(reader.readLine());

            if (x == -1) {
                break;
            }
            count++;
            sum = sum + x;
        }

            double z =(double) sum/count;


          

        System.out.println(z);

    }
}