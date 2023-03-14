package com.javarush.Level_Core_19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class Sol_19_11 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        StringBuilder stringBuilder = new StringBuilder(result);
        String num = stringBuilder.toString().replaceAll("\\D",""); //ЗАМЕНЯЕМ ВСЕ НЕ ЦИФРОВЫЕ СИМВОЛЫ НА ПУСТОТУ
        System.out.println(num);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}


