package com.javarush.Level_Core_18;

import java.io.*;

public class Sol_18_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        FileInputStream inputStream2 = new FileInputStream(s2);

        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[inputStream2.available()];

        while (inputStream.available() > 0)
        {
           inputStream.read(buffer);
        }

        while (inputStream2.available() > 0)
        {
            inputStream2.read(buffer2);
        }
        FileOutputStream outputStream = new FileOutputStream(s);
        outputStream.write(buffer2);
        outputStream.write(buffer);


        reader.close();
        inputStream.close();
        outputStream.close();
        inputStream2.close();

    }
}