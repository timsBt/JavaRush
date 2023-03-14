package com.javarush.Level_Core_17.Sol_17_6;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {

        return president;
    }

   static  {
        synchronized (OurPresident.class) {
            president = new OurPresident();

        }
    }


}
