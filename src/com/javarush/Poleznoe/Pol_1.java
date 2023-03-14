package com.javarush.Poleznoe;

import java.io.*;

public class Pol_1 {
//ЗАПИСЬ ТЕКСТА ИЗ ОДНОГО ФАЙЛА В ДРУГОЙ

    public static void main(String[] args) throws IOException {
        InputStream inStream = new FileInputStream("C:\\Users\\timsb\\OneDrive\\Рабочий стол\\Новая папка (3)\\Новый текстовый документ (2).txt");
        OutputStream outStream = new FileOutputStream("C:\\Users\\timsb\\OneDrive\\Рабочий стол\\Новая папка (3)\\Новый текстовый документ (3).txt");

        while (inStream.available() > 0) {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();


    }


}
