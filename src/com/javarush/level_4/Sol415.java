package com.javarush.level_4;

public class Sol415 {
// ТАБЛИЦА УМНОЖЕНИЯ С ПОМОЩЬЮ while
    public static void main(String[] args) {

        int i = 0;
        while (i < 10){
            i++;
            int y = 1;
            while (y <= 10){
                int x = i * y;
                System.out.print(x + " ");
                y++;
            }
            System.out.println();
        }





    }




}
