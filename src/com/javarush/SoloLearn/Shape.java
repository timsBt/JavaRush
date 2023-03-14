package com.javarush.SoloLearn;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
     class Square extends Shape{
   public void area(){
       width = width*width;
       System.out.println(width);
   }
        Square(int x){
            this.width = x;
    }
        }
        class Circle extends Shape{
            double width;
            public void area(){
                width =  Math.PI * width * width;
                System.out.println(width);
            }
            Circle(int y){
                this.width = y;
            }
        }

class Programmm {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}


