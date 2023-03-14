package com.javarush.Level_Core_19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class Sol_19_9 {
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

        //разворачиваем строку
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverseString = stringBuilder.toString().toUpperCase(); // ВСЕ СЛОВА С БОЛЬШОЙ БУКВЫ

        //выводим ее в консоль
        System.out.println(reverseString);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

