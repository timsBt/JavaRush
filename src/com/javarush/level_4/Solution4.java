package com.javarush.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int a = Integer.parseInt(s);

        if (a==1)
            System.out.println("понедельник");
        else if (a==2)
            System.out.println("вторник");
        else if (a==3)
            System.out.println("среда");
       else if (a==4)
            System.out.println("четверг");
        else if (a==5)
            System.out.println("пятница");
       else if (a==6)
            System.out.println("суббота");
        else if (a==7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");



    }
}