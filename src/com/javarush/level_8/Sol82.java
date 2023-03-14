package com.javarush.level_8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sol82 {

    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
// напишите тут ваш код
        Date currentTime = new Date();
        insert10000(list);
        Date newTime = new Date();
        long time = newTime.getTime() - currentTime.getTime();
        return time;

// напишите тут ваш код

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}



