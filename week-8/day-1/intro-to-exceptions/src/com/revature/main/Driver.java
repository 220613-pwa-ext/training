package com.revature.main;

import com.revature.exception.DenominatorCannotBeZeroException;

import java.util.Scanner;

public class Driver {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator c = new Calculator();

        while (true) {
            try {
                System.out.println("Do you want to quit? (y/n)");
                String choice = sc.nextLine();
                if (choice.equals("y")) {
                    break;
                }

                System.out.println("Please enter a numerator: ");
                int numerator = Integer.parseInt(sc.nextLine());

                System.out.println("Please enter a denominator: ");
                int denominator = Integer.parseInt(sc.nextLine());

                int result = c.divide(numerator, denominator);
                System.out.println("The result is " + result);
            } catch (DenominatorCannotBeZeroException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again!");
            }
        }

        System.out.println("Hello");
        System.out.println("Hi");
        System.out.println("Testing");
    }

}
