package com.javarush.Level_Core_19;

import java.io.*;

public class Sol_19_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());

        bufferedReader.close();

        int x = 0;
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            x++;
            if (x % 2 == 0)
                writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }



    }


