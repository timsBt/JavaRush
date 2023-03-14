package com.javarush.Level_Core_18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Sol_18_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());


        byte[] buffer = new byte[inputStream.available()];


        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int count = inputStream.read(buffer);
            for (int i = buffer.length - 1; i >= 0; i--) { //ЗАПИСЫВАЕМ В СОДЕРЖИМОЕ ФАЙЛА В ОБРТАНОМ ПОРЯДКЕ
                outputStream.write(buffer[i]);
            }
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }
}
