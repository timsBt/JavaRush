package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol417 {
    // ВВОДИМ ЧИСЛА И ВЫВОДИМ ИХ СУММУ ПОСЛЕ ТОГО КАК ВВЕЛИ ЧИСЛО -1

    public static void main(String[] args) throws IOException {

int x = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            x = x + number;
            if (number == -1)
                break;
        }
        System.out.println(x);


        }
    }
