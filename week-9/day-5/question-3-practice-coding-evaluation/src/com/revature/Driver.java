package com.revature;

public class Driver {

    public static void main(String[] args) {
        int[] input = new int[] { 2, 3, 1, 4, 5 };

        System.out.println(carrotsConsumed(2, input));
    }

    public static int carrotsConsumed(int M, int[] arr) {
        int carrotsEaten = 0;

        for (int i = 0; i < arr.length; i = i + M) {
            carrotsEaten = carrotsEaten + arr[i];
        }

        return carrotsEaten;
    }

}
