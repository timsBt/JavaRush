package com.javarush.Level_Core_19;

import java.io.*;
import java.util.ArrayList;

public class Sol_19_8 {
    // МОИ КОММЕНТЫ

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(a));
        BufferedWriter writer = new BufferedWriter(new FileWriter(b));

        StringBuilder line = new StringBuilder(); // СОЗДАЕМ СТРИНГ СТРОКУ,КОТОРУЮ МОЖНО РЕДАКТИРОВАТЬ

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            char c = (char) reader.read(); // ЧИТАЕМ СИМВОЛ В ЦИКЛЕ
           line.append(c); //ДОБАВЛЯЕМ В LINE СИМВОЛ - char c
        }

        String m = line.toString();
        String x = m.replaceAll("\\p{P}",""); // УДАЛЯЕМ ВСЕ ПУНКТУАЦИИ
        writer.write(x);

        //закрываем потоки после использования
        bufferedReader.close();
        reader.close();
        writer.close();
    }
}


