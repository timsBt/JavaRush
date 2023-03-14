package com.javarush.Level_Core_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sol_18_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());

        int count = 0;

        while (fis.available() > 0) {//пока остались непрочитанные байты
         byte x = (byte) fis.read();
         if ( x == 44)
             count++;

        }
        System.out.print(count);
        fis.close();
    }
}
