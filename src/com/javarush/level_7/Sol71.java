package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sol71 {

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
// создай и заполни массив
        int [] list = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }
    public static int max(int[] array) {
// найди максимальное значение
        int max = array [0];
        for (int i = 1; i < 5; i++){
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}



