package com.revature.main;

public class Driver {
    public static int y = 10; // This variable belongs to the Driver class/blueprint
    // class scoped/static scoped/global scoped variable

    public static void main(String[] args) {
        // Control flow
        // -> If, else if, else
        // -> Loops: for, while, do-while
        // -> Switch
        boolean myBoolean = false; // method scoped variable
        if (myBoolean) {
            System.out.println("This runs because myBoolean is true");
        } else {
            System.out.println("This runs because myBoolean is false");
        }


        // Write a program that prints out
        // 1. "Number is negative" if a variable is less than 0
        // 2. "Number is positive" if a variable is greater than 0
        // 3. "Number is zero" if a variable is 0
        int myInt = 0;
        if (myInt < 0) {
            System.out.println("Number is negative");
        } else if (myInt > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }

        // Loops
        // There are the break and continue keywords that you can use for any type of loop
        // break keyword: to exit a loop
        // continue keyword: to skip the rest of the code in a particular iteration and move onto the next iteration

        // Print out numbers from 1 to 10

        // For
        for (int i = 1; i < 11; i = i + 1) { // i is block scoped
            System.out.println(i);
        }

        // While
        int counter = 1; // i is method scoped
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // Print out numbers from 10 to 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        counter = 10; // counter (method scoped) already exists, we are simply reassigning a new value to counter
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        /*
            Do-while loops

            Do-while is guaranteed to run once because it evaluates the condition at the end rather than the beginning
            So, even if a condition was false to begin with, it doesn't evaluate until the end of that iteration

            On the other hand, while loops must be true to begin with to even run through a single iteration
         */
        System.out.println();
        int x = 0;
        do {
            System.out.println(x);
        } while (x < -10);

        /*
            Switch exists in Java and JavaScript, but not Python

            Basically a fancy way of doing a bunch of if, else if, else blocks
         */

        // if, else if, else
        int month = 2;
        if (month == 1) {
            System.out.println("It is January");
        } else if (month == 2) {
            System.out.println("It is February");
        } else if (month == 3) {
            System.out.println("It is March");
        } else {
            System.out.println("It is not January, February, or March");
        }

        // switch statement
        switch(month) {
            case 1:
                System.out.println("It is January");
                break; // The break keyword in a switch block is used to prevent "fall-through"
                // "fall-through" is where subsequent code in subsequent cases get executed
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            default:
                System.out.println("It is not January, February, or March");
        }

    }

}
