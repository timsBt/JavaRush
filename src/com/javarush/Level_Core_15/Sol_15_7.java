package com.javarush.Level_Core_15;

public class Sol_15_7 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, double n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(short m, short n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(String m, String n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(byte m, byte n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(float m, float n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(long m, long n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(char m, char n, String value) {
        System.out.println(m + " " + n + " " + value);
    }

    public static void printMatrix(boolean m, boolean n, String value) {
        System.out.println(m + " " + n + " " + value);
    }


}




