package com.javarush.Level_Core_13;

public class Sol_13_10 {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }

    interface HasManagementPotential{
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person,HasManagementPotential{
    }

    class Manager implements Boss{
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }

}