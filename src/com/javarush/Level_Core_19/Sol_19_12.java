package com.javarush.Level_Core_19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Sol_19_12 {
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

        String[] x = stringBuilder.toString().split(" ");
        int one = Integer.parseInt(x[0]);
        int two = Integer.parseInt(x[2]);

        int sum = 0;
        if (x[1].equals("+"))
            sum = one+two;
        if (x[1].equals("-"))
            sum = one-two;
        if (x[1].equals("*"))
            sum = one*two;

       System.out.print(stringBuilder.toString().replace("\r\n","") + sum);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}



