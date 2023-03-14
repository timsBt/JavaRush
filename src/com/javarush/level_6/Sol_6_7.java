package com.javarush.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol_6_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat (grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat (grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat (fatherName,null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother,null);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {

            if (parent == null && parent2 == null)
                return "The cat's name is " + name + ", no mother ," + "no father";

           else if (parent == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parent2.name;

           else if (parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";

            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
        }
    }

}