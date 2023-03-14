package com.javarush.Level_Core_13;

public class Sol_13_7 {

    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}



