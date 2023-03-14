package com.javarush.Level_Core_15.task1529;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {

    public static void main(String[] args) {


    }

    static {
//add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
//add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String x = reader.readLine();
            if(x.equals("helicopter"))
                result = new Helicopter();
            if(x.equals("plane")) {
                int y = Integer.parseInt(reader.readLine());
                result = new Plane(y);

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
   public void close(){

   }
}
