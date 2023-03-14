package com.javarush.Level_Core_13;

public class Sol_13_20 {

    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }

}
