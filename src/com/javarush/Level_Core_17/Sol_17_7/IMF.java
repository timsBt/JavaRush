package com.javarush.Level_Core_17.Sol_17_7;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        {  synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        }


//add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}

