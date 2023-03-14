package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol78 {
    public static void main(String[] args) throws IOException {


    ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4));
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

}
}