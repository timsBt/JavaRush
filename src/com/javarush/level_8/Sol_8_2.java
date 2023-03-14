package com.javarush.level_8;

import java.util.ArrayList;

public class Sol_8_2 {
    public static void main(String[] args) {
//напишите тут ваш код
        ArrayList<Human> child = new ArrayList<>();
        ArrayList<Human> parentsFather = new ArrayList<>();
        ArrayList<Human> parentsMother = new ArrayList<>();
        ArrayList<Human> dedbab = new ArrayList<>();
        ArrayList<Human> nul = new ArrayList<>();

        Human child1 = new Human("Tom",true, 4,nul);
        Human child2 = new Human("Djon",true, 5,nul);
        Human child3 = new Human("Emma",false, 7,nul);

        Human father = new Human("Deimos",true, 40,child);
        Human mother = new Human("Darla",false, 35,child);

        Human ded1 = new Human("Nik",true, 70,parentsFather);
        Human ded2 = new Human("Mikki",true, 75,parentsMother);

        Human babka1 = new Human("Rouse",false, 65,parentsFather);
        Human babka2 = new Human("Helly",false, 63,parentsMother);

        child.add(child1);
        child.add(child2);
        child.add(child3);

        parentsFather.add(father);
        parentsMother.add(mother);

        dedbab.add(ded1);
        dedbab.add(ded2);
        dedbab.add(babka1);
        dedbab.add(babka2);

        for (int i = 0; i < child.size(); i++) {
            System.out.println(child.get(i));
        }

        for (int i = 0; i < parentsFather.size(); i++) {
            System.out.println(parentsFather.get(i));
        }
        for (int i = 0; i < parentsMother.size(); i++) {
            System.out.println(parentsMother.get(i));
        }

        for (int i = 0; i < dedbab.size(); i++) {
            System.out.println(dedbab.get(i));
        }



    }

    public static class Human {
//напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name,boolean sex,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex,int age,ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
