package com.javarush.Level_Core_18;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol_18_1 {
    // ВЫВОД МАКСИМАЛЬНОГО БАЙТА ИЗ ФАЙЛА
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max = inputStream.read();


        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            if (data > max) {
                max = data;
            }
        }

        inputStream.close(); // закрываем поток

        System.out.println(max);


    }

}
