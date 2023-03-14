package com.javarush.level_8;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sol88 {
    public static Map<String, Integer> createMap() {
//Удаление знрачения меньше 500
     HashMap<String,Integer> hit = new HashMap<String, Integer>();

        hit.put("Иванов",100);
        hit.put("Сидоров",200);
        hit.put("Петров",300);
        hit.put("Бекматов",600);
        hit.put("Тимуров",900);
        hit.put("Тимуров1",90);
        hit.put("Тимуров2",10);
        hit.put("Тимуров3",9);
        hit.put("Тимуров4",130);
        hit.put("Тимуров5",190);
         return hit;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 500)
                iterator.remove();
        }
        System.out.println(map);
    }


//напишите тут ваш код


    public static void main(String[] args) {


        removeItemFromMap(createMap());

    }
}



