package com.javarush.SoloLearn;

import java.io.IOException;
import java.util.Scanner;

public class Zadacha2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();




        for (int i = 0; i < 6; i++) {
            amount = (int) (amount - (amount * 0.1));

            System.out.println(amount);

        }


    }
}