package com.javarush.level_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sol87 {

    public static Map<String, String> createMap() {
//напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Бекматов", "Тимур");
        map.put("Иванов", "Иван");
        map.put("Сидоро", "Сидр");
        map.put("Петров", "Петр");
        map.put("Сиоров", "Петр");
        map.put("Кейсов", "Петр");
        map.put("Сидорв", "Дориан");
        map.put("Сдоров", "Батлер");
        map.put("Сидоров", "Петр");
        map.put("Чмошников", "Чмошник");

return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int i = 0;
        for (String age : map.values()){
            if (age.equals(name)){
                i++;
            }
        }
        System.out.println(i);
        return i;



    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int i = 0;
        for (String man : map.keySet()) {
            if (man.equals(lastName)) {
                i++;
            }
        }

return i;
    }

    public static void main(String[] args) {
removeTheFirstNameDuplicates(createMap());
    }








    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Map<String, String> copys = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copys.entrySet()) {
            String val = pair.getValue();
            String key = pair.getKey();
            for (Map.Entry<String, String> mair : copys.entrySet()) {
                String va2 = mair.getValue();
                String ke2 = mair.getKey();
                if (va2.equals(val) && !key.equals(ke2)) {
                    getCountTheSameFirstName(map, val);
                }
            }
        }


    }
}

