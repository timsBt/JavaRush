package com.javarush.level_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol_8_1 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat cat : cats) {
            cats.remove(cat);
            break;
//напишите тут ваш код. step 3 - пункт 3
        }
            printCats(cats);

    }
    public static Set<Cat> createCats() {
//напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> set = new HashSet<Cat>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> cats) {
// step 4 - пункт 4
        Iterator<Cat> it = cats.iterator();
        while (it.hasNext())
        {
            Cat str = it.next();
            System.out.println(str);
        }

    }

    public static class Cat {

    }
// step 1 - пункт 1
}

