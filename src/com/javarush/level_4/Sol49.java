package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol49 {

    //ВВЕСТИ ТРИ ЧИСЛА.ВЫВЕСТИ НА ЭКРАН КОЛ-ВО ПОЛОЖИТЕЛЬНЫХ ЧИСЕЛ. ИСПОЛЬЗОВАЛ СЧЕТЧИК
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int count = 0;

        if (a > 0)
            count++;
      if (b > 0)
            count++;
        if (c > 0)
            count++;
        System.out.println(count);

    }
}