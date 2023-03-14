package com.javarush.Sbor_klassov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {

    class Cat
    {
        String name;

        Cat(String name)
        {
            this.name = name;
        }

        protected void finalize() throws Throwable
        {
            System.out.println(name + " destroyed");
        }
    }

    public static void main(String[] args) {

    }

    }
