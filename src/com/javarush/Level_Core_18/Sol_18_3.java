package com.javarush.Level_Core_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Sol_18_3 {
//НЕРЕШАНАААААА
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            list.add(data);
        }
        inputStream.close(); // закрываем поток
        Collections.sort(list);
        int max;


        HashMap<ArrayList<Integer>, ArrayList<Integer>> map = new HashMap<>();
        map.put(list,list);

        for (ArrayList<Integer> key: map.keySet())
        {
            ArrayList<Integer> value = map.get(key);

            System.out.println(key + " --> " + value);


        }

    }
}