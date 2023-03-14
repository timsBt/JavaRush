package com.javarush.SoloLearn;

import com.javarush.Level_Core_11.Sol_11_2;

import java.util.*;

public class Bowling {

        HashMap<String, Integer> players;

        Bowling() {
            players = new HashMap<String, Integer>();
        }

        public void addPlayer(String name, int p) {
            players.put(name, p);
        }

        public void getWinner() {
            int max = 0;
            String x = "";
            for(Map.Entry<String, Integer> pair: players.entrySet())
            {
                String key = pair.getKey();
                Integer value = pair.getValue();
                if (value > max)
                    max = value;

            }
            System.out.println(max);

            }



}
//введите код сюда




    class Program {
        public static void main(String[] args) {
            Bowling game = new Bowling();
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                game.addPlayer(name, points);
            }
            game.getWinner();
        }


    }
