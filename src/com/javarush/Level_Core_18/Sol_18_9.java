package com.javarush.Level_Core_18;

import java.io.*;

public class Sol_18_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine(), true);
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream2 = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            outputStream.write(data); // и записать его во второй поток
        }

        while (inputStream2.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream2.read(); // прочитать очередной байт в переменную data
            outputStream.write(data); // и записать его во второй поток
        }
        inputStream.close();
        outputStream.close();
        inputStream2.close();

    }
}
