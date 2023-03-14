package com.javarush.Level_Core_15.task1522;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

static {
    readKeyFromConsoleAndInitPlanet();
}
//add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
// implement step #5 here - реализуйте задание №5 тут

        Scanner skan = new Scanner(System.in);
        String a = skan.nextLine();
        if (a.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        }
        else if (a.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        }
        else if (a.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }
        else
            thePlanet = null;

    }
}
