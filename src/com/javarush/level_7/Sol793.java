package com.javarush.level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol793 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> tree = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);

            if (a % 2 == 0 && a % 3 == 0) {
                two.add(a);
                tree.add(a);
            } else if (a % 2 == 0)
                two.add(a);
            else if (a % 3 == 0)
                tree.add(a);
            else
                one.add(a);
        }

        printList(tree);
        printList(two);
        printList(one);

    }
    public static void printList(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        }
    }

