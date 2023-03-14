package com.javarush.Level_Core_13;

public class Sol_13_19 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();

    }

    static class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }


}
