package com.javarush.level_7;

import java.util.Scanner;

public class Sol72 {
    public static void main(String[] args) {
        String [] list = new String[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++){
            list[i] = scan.nextLine();
        }
        for (int i = 9; i >= 0; i--){
            System.out.println(list[i]);
        }
    }
}
