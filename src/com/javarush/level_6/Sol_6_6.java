package com.javarush.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol_6_6 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

    while (x > 0){
        if (x % 2 == 0){
            even++;
        }
        else{
            odd++;
        }
        x = x / 10;

        }
        System.out.println("Even:" + even + " Odd:" + odd);
    }

}
