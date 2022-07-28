package com.revature.main;

public class Driver {

    public static void main(String[] args) {
//        fizzBuzzRudimentary(100);
        fizzBuzzElegant(100);
    }

    public static void fizzBuzzRudimentary(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzzElegant(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0) {
                sb.append("Fizz");
            }

            if (i % 5 == 0) {
                sb.append("Buzz");
            }

            String output = sb.toString().equals("") ? ("" + i) : (sb.toString());
            System.out.println(output);
        }

    }

}
