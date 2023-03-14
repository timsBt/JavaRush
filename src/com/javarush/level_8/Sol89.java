package com.javarush.level_8;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sol89 {
    public static Map<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Бекматов", "Тимур");
        map.put("Иванов", "Петр");
        map.put("Сидоров2", "Сидр");
        map.put("Петрoв", "Петр");
        map.put("Уланов", "Улан");
        map.put("Кейсов", "Петр");
        map.put("Дорианов", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Скарлетов", "Петр");
        map.put("Чмошников", "Чмошник");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Map<String, String> copys = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copys.entrySet()) {
           String val = pair.getValue();
          String key = pair.getKey();
            for (Map.Entry<String, String> mair : copys.entrySet()){
               String va2 = mair.getValue();
              String ke2 = mair.getKey();
                if (va2.equals(val) && !key.equals(ke2)){
                    removeItemFromMapByValue(map,val);
                }
            }
        }


    }



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }

        }


    }

    public static void main(String[] args) {
removeTheFirstNameDuplicates(createMap());

    }
}



