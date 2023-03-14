package com.javarush.Level_Core_19;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sol_19_5 {

//С МОИМИ КОММЕНТАРИЯМИ

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());

        StringBuilder line = new StringBuilder(); // СОЗДАЕМ СТРИНГ СТРОКУ,КОТОРУЮ МОЖНО РЕДАКТИРОВАТЬ
        int count = 0; // СЧЕТЧИК
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            char c = (char) reader.read(); // ЧИТАЕМ СИМВОЛ
            line.append(c); //ДОБАВЛЯЕМ В LINE СИМВОЛ С
        }

            Pattern ema = Pattern.compile("\\bworld\\b"); // b - ЭТО ГРАНИЦА СЛОВА
            Matcher matcher = ema.matcher(line);
            while (matcher.find()) {
                count++;
            }

            System.out.println(count);

        reader.close();
        bufferedReader.close();


    }
}
