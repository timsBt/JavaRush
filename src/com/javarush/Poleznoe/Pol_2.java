package com.javarush.Poleznoe;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pol_2 {
    //ЗАПИСЬ ТЕКСТА В ФАЙЛ НА КОМПЕ

    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\timsb\\OneDrive\\Рабочий стол\\Новая папка (3)\\Новый текстовый документ (2).txt");
        BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream);

        String text = "I love Java!";
// эту строку мы преобразуем в массив байтов и запишем в файл


        byte[] buffer = text.getBytes();

        bufferedStream.write(buffer, 0, buffer.length);
        bufferedStream.close();
    }
}

