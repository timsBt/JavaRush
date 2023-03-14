package com.javarush.Level_Core_19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException{
            String name = fileScanner.nextLine();
            String[] words = name.split(" ",4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd mm yyyy", Locale.ENGLISH);
            String date = words[3];
            Date date2 = null;
            try {
                date2 = dateFormat.parse(date);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return new Person(words[1],words[2],words[0],date2 );
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}