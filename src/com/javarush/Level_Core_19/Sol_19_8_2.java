package com.javarush.Level_Core_19;

import java.io.*;
import java.util.ArrayList;

public class Sol_19_8_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(a));
        BufferedWriter writer = new BufferedWriter(new FileWriter(b));

        ArrayList<String> list = new ArrayList<String>();

        while (reader.ready()){

            list.add(reader.readLine());
        }

        String x = list.toString().replaceAll("\\p{P}" , "");
        writer.write(x);

        bufferedReader.close();
        reader.close();
        writer.close();

    }
}
