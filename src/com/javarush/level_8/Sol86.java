package com.javarush.level_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol86 {

    public static Set<Integer> createSet(){

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);

        }


        return set;


    }

    public static Set<Integer> remove(Set<Integer> set){
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
        {
            int str = it.next();
            if (str > 10)
            it.remove();
        }
return set;
    }




    public static void main(String[] args) {

        System.out.println(remove(createSet()));



    }
}



