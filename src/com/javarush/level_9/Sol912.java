package com.javarush.level_9;

import java.util.HashMap;

public class Sol912 {
    public static void main(String[] args) {


        try {
            HashMap<String, String> map = new HashMap<String, String>(null);

            map.put(null, null);
            map.remove(null);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
