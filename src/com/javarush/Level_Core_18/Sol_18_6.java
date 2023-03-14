package com.javarush.Level_Core_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol_18_6 {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            FileInputStream inputStream = new FileInputStream(reader.readLine());

            if (inputStream.available() < 1000) {
                inputStream.close(); // закрываем поток
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {


    }
}





