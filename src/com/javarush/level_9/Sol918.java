package com.javarush.level_9;

public class Sol918 {

    public static void main(String[] args) {


    }

    static class MyException extends Exception{

    }

    static class MyException2 extends MyException{

    }

    static class MyException3 extends RuntimeException{

    }

    static class MyException4 extends MyException3{

    }

}
