package com.javarush.Level_Core_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Sol_15_16 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int input = Integer.parseInt(reader.readLine());
            reader.close();

            System.out.println(factorial(input));
        }

        public static String factorial(int n) {
//add your code here
            BigInteger result = BigInteger.ONE;
            if (n >= 0) {
                for (int i = 1; i <= n; i++) {
                    result = result.multiply(BigInteger.valueOf(i));
                }
                return result.toString();
            }
            else
                return "0";
        }
    }

