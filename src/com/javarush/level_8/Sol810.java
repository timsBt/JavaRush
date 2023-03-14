package com.javarush.level_8;

import java.util.HashMap;
import java.util.Map;

public class Sol810 {

        public static void main(String[] args) {
            Map<String, String> map = createPeopleMap();
            printPeopleMap(map);
        }

        public static Map<String, String> createPeopleMap() {
            Map<String, String> map = new HashMap<>();
            map.put("Бекм", "Тим");
            map.put("Иванов", "Петр");
            map.put("Сидоров2", "Сидр");
            map.put("Петрoв", "Петр");
            map.put("Уланов", "Улан");
            map.put("Иванов", "Петрffff");
            map.put("Дорианов", "Петр");
            map.put("Сидоров2", "Чмошник");
            map.put("Скарлетов", "Петр");
            map.put("Djon", "White");


            return map;
        }

        public static void printPeopleMap(Map<String, String> map) {
            for (Map.Entry<String, String> s : map.entrySet()) {
                System.out.println(s.getKey() + " " + s.getValue());
            }
        }
    }


