package com.javarush.level_6;

public class Sol63 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }
    public static class Idea{

        public String getDescription(){
            String a = "Тимур";
            return a;
        }
    }

    public static void printIdea(Idea idea){

             System.out.println(idea.getDescription());
    }


}
