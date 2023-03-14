package com.javarush.level_9;

import com.javarush.Sbor_klassov.Cat1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sol_9_1 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
//напишите тут ваш код
        HashMap<String , Cat> mar = new HashMap<>();
      mar.put("Cat1", new Cat("Bars1"));
      mar.put("Cat2", new Cat("Bars2"));
      mar.put("Cat3", new Cat("Bars3"));
      mar.put("Cat4", new Cat("Bars4"));
      mar.put("Cat5", new Cat("Bars5"));
      mar.put("Cat6", new Cat("Bars6"));
      mar.put("Cat7", new Cat("Bars7"));
      mar.put("Cat8", new Cat("Bars8"));
      mar.put("Cat9", new Cat("Bars9"));
      mar.put("Cat10", new Cat("Bars10"));

return mar;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
//напишите тут ваш код
        Set <Cat> sets = new HashSet<>();
        sets.addAll(map.values());
return sets;
        }



    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}