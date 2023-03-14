package com.javarush.Level_Core_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol_18_2 {

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

        Collections.sort(list); // сортировка листа по порядку

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer element : list) {
            if (!newList.contains(element)) {  // // Если этого элемента нет в newList
                newList.add(element);  // добавить в список
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i)+" ");
        }
    }
}
