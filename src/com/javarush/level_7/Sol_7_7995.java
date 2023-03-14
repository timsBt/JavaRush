package com.javarush.level_7;

public class Sol_7_7995 {

    public static void main(String[] args) {
// напишите тут ваш код
        Human hum = new Human("Anna",false, 49);
        Human hum2 = new Human("Kate",false, 59);
        Human hum3 = new Human("Victor",true, 59);
        Human hum4 = new Human("Igor",true, 59);

        Human hum5 = new Human("Anya",false, 49,hum4,hum);
        Human hum6 = new Human("Lena",false, 49,hum3,hum2);
        Human hum7 = new Human("Lesya",false, 49,hum4,hum);
        Human hum8 = new Human("Tom",true, 49,hum3,hum2);
        Human hum9 = new Human("Kris",true, 49,hum4,hum);

        System.out.println(hum);
        System.out.println(hum2);
        System.out.println(hum3);
        System.out.println(hum4);
        System.out.println(hum5);
        System.out.println(hum6);
        System.out.println(hum7);
        System.out.println(hum8);
        System.out.println(hum9);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name,boolean sex,int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name,boolean sex,int age,Human father,Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
