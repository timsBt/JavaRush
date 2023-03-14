package com.javarush.Level_Core_11;

public class Sol_11_2 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(0, 0);
        }
        int min = inputArray[0];
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
                     if(inputArray[i] < min)
                         min = inputArray[i];
                     else if (inputArray[i] > max)
                         max = inputArray[i];
        }

        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}




