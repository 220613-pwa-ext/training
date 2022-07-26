package com.revature.main;

import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Pet;

import java.util.Scanner;

public class Driver {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        Pet p = new Pet();
//        p.play(); // This is a generic Pet object, so we don't know how it plays
//
//        Pet p2 = new Dog();
//        p2.play(); // The dog is playing fetch!
//
//        Pet p3 = new Cat();
//        p3.play();

        System.out.println("Please type 1 to select a Pet object, 2 to select a Dog, 3 to select a Cat");
        String userInput = sc.nextLine();
        int choice = Integer.parseInt(userInput);

        Pet p = null; // null means no object
        if (choice == 1) {
            p = new Pet();
        } else if (choice == 2) {
            p = new Dog();
        } else if (choice == 3) {
            p = new Cat();
        }

        if (p != null) {
            p.play(); // The behavior of .play() totally depends on which object was chosen at runtime
            // Hence, method overriding is considered "runtime polymorphism"

            System.out.println("Enter the food that the animal would like to eat:");
            String food = sc.nextLine();
            if (food.equals("")) {
                p.eat();
            } else {
                p.eat(food);
            }

        } else {
            System.out.println("No object selected");
        }

    }

}
