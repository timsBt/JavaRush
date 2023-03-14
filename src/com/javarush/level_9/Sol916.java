package com.javarush.level_9;



import java.io.IOException;
import java.rmi.RemoteException;

public class Sol916 {
    public static void main(String[] args) {
        handleExceptions(new Sol916());

    }

    public static void handleExceptions(Sol916 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException | NoSuchFieldException e){
            System.out.println(e);

        }


    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}





