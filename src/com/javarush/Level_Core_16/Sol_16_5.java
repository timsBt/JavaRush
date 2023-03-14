package com.javarush.Level_Core_16;

import java.util.Date;

public class Sol_16_5 {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();

        }

        @Override
        public void run() {

            long time = startPlaying().getTime();
            sleepNSeconds(1);
            long netime = stopPlaying().getTime();
            long msDelay = netime-time;
            System.out.println( "Playing " + msDelay + " ms");


        }
    }
}


