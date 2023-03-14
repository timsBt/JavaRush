package com.javarush;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Proba{
//ЗАПИСЬ ТЕКСТА В ФАЙЛ НА КОМПЕ

    public static void main(String[] args) throws IOException {


        String s = "text.999, in,world,9. file,world55. 99 flight 8world.";

       String mood =  s.replace(".","!");
        System.out.println(mood);



    }
}