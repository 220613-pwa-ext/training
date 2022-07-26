package com.revature.main;

public class Driver {

    // Lists v. Array
    // A JS array is technically a List, not an array
    // A Python List is a list

    // List: essentially an expandable array where you can add an unlimited amount of elements to that array
    // Array (in computer science): a data structure that can store individual elements where the size is fixed
    //                              -> Arrays consist of pre-allocated contiguous memory where each element is located
    //                                  adjacent to another element
    public static void main(String[] args) {
        // Arrays can only store one type of data
        // Arrays are fixed in size

        int[] myIntArray = new int[10]; // Why do we need "new"? We're constructing an int array object
        System.out.println(myIntArray);

        myIntArray[0] = -100;
        myIntArray[1] = 20;
        myIntArray[2] = 33;
        myIntArray[3] = 54;
        myIntArray[4] = 1;
        myIntArray[5] = 100000;
        myIntArray[6] = -64453;
        myIntArray[7] = -12123;
        myIntArray[8] = 343;
        myIntArray[9] = 400;

        int[] myIntArray4 = new int[3]; // An array of size 3 with elements [0, 0, 0]
        int[] myIntArray3 = new int[] { 1, 2, 3 }; // An array of size 3 with elements [1, 2, 3]

        // An array of size 3 with elements [10, 20, 30]
        int[] myIntArray2 = { 10, 20, 30 }; // Shorthand for int[] myIntArray2 = new int[] { 10, 20, 30, 33 };

        // Access indices
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }

        double[] myDoubleArray = new double[3];
        myDoubleArray[0] = 3.1415;
        myDoubleArray[1] = 10.5;
        myDoubleArray[2] = -100.53;

        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.println(myDoubleArray[i]);
        }

        String[] myStringArray = new String[5];
        myStringArray[0] = "Hello";
        myStringArray[1] = "Greetings";
        myStringArray[2] = "Konichiwa";
        myStringArray[3] = "Chao";
        myStringArray[4] = "Bonjour";

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        boolean[] myBooleanArray = new boolean[3];
        myBooleanArray[0] = true;
        myBooleanArray[1] = true;
        myBooleanArray[2] = false;

        for (int i = 0; i < myBooleanArray.length; i++) {
            System.out.println(myBooleanArray[i]);
        }

        // Iterating over array using for-each loop
        // For-each loop con/drawback: for-each can only go from beginning to end of array
        for (int e : myIntArray) {
            System.out.println(e);
        }

        for (double e : myDoubleArray) {
            System.out.println(e);
        }

        for (String e : myStringArray) {
            System.out.println(e);
        }

        for (boolean e : myBooleanArray) {
            System.out.println(e);
        }

        // Iterate through array in reverse order (from index 9 to 0)
        for (int i = myIntArray.length - 1; i >= 0; i--) {
            System.out.println(myIntArray[i]);
        }

        /*
            2D array, n-D array, etc.
         */

        // 2D array: arrays inside of an array
        int[][] my2DIntArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; // Array that contains 3 arrays (of size 3)
        // (3 x 3) 2D int array
        System.out.println(my2DIntArray[0][0]); // 1
        System.out.println(my2DIntArray[0][1]); // 2
        System.out.println(my2DIntArray[0][2]); // 3

        System.out.println(my2DIntArray[1][0]); // 4
        System.out.println(my2DIntArray[1][1]); // 5
        System.out.println(my2DIntArray[1][2]); // 6

        System.out.println(my2DIntArray[2][0]); // 7
        System.out.println(my2DIntArray[2][1]); // 8
        System.out.println(my2DIntArray[2][2]); // 9

        // Using loops
        for (int i = 0; i < my2DIntArray.length; i++) { // my2DIntArray.length <- number of rows
            for (int j = 0; j < my2DIntArray[i].length; j++) {
                System.out.println(my2DIntArray[i][j]);
            }
        }

        // Using for-each loop
        for (int[] arr : my2DIntArray) {
            for (int e : arr) {
                System.out.println(e);
            }
        }

    }

}
