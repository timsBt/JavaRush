package com.javarush.Level_Core_19;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sol_19_6 {

    // С МОИМИ КОМЕНТАМИ
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));


//        FileReader reader = new FileReader(bufferedReader.readLine());
//        FileWriter writer = new FileWriter(bufferedReader.readLine());

        StringBuilder line = new StringBuilder(); // СОЗДАЕМ СТРИНГ СТРОКУ,КОТОРУЮ МОЖНО РЕДАКТИРОВАТЬ

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            char c = (char) reader.read(); // ЧИТАЕМ СИМВОЛ В ЦИКЛЕ
            line.append(c); //ДОБАВЛЯЕМ В LINE СИМВОЛ - char c
        }
            Pattern pat = Pattern.compile("\\b\\d+\\b"); // ИЩЕМ ЦИФРЫ,\\b - ГРАНИЦА СЛОВА \\d - СИМВОЛ ЦИФРЫ, + - ОТ ОДНОГО И БОЛЕЕ ЧИСЕЛ
            Matcher matcher = pat.matcher(line);
            while (matcher.find()){
                writer.write(matcher.group() + " "); //ЗАПИСЫВАЕМ ВО 2Й ФАЙЛ НАЙДЕННЫЕ ЦИФРЫ
            }

        //закрываем потоки после использования
        bufferedReader.close();
        reader.close();
        writer.close();
    }

}
