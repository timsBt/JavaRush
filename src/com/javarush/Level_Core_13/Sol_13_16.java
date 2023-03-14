package com.javarush.Level_Core_13;

import java.io.*;

public class Sol_13_16 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inStream = new FileInputStream("C:\\Users\\timsb\\OneDrive\\Рабочий стол\\Fail.txt");

        while (inStream.available() > 0) {
            int data = inStream.read();
            System.out.print((char) data);
        }


        inStream.close();
        reader.close();
    }
}



