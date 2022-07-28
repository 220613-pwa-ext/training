package com.revature.main;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        int[] myIntArray = new int[] {5, 100, 15, -10, 4};

        System.out.println(differenceOfMaximumAndMinimumSorting(myIntArray));
        System.out.println(differenceOfMaximumAndMinimumEfficient(myIntArray));

        System.out.println(Arrays.toString(myIntArray)); // [5, 100, 15, -10, 4]
    }

    // O(n)
    public static int differenceOfMaximumAndMinimumEfficient(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // we have found a larger value than the current max
                max = arr[i];
            }

            if (arr[i] < min) { // we have found a smaller value than the current min
                min = arr[i];
            }
        }

        return max - min;
    }

    // O(n log n) <- sorting requires O(n log n)
    public static int differenceOfMaximumAndMinimumSorting(int[] arr) {

        int[] newArr = new int[arr.length];
        // Copy elements from arr to newArr
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Sort the new array so that we do not modify the original array passed in (arr)
        Arrays.sort(newArr);
        return newArr[newArr.length - 1] - newArr[0];
    }

}
