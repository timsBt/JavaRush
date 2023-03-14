package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol799 {

        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<String>();
           while (true) {

               String s = reader.readLine();
               if (s.equals("end"))
                   break;
               list.add(s);
           }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

    }
}
