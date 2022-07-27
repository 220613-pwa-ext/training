package com.revature.main;

import com.revature.model.*;

import java.util.Scanner;

public class Driver {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the shape area calculator");
        System.out.println("1.) Circle");
        System.out.println("2.) Triangle");
        System.out.println("3.) Rectangle");
        System.out.println("4.) Square");
        System.out.println("Please select a shape: ");

        int choice = Integer.parseInt(sc.nextLine());

        Shape s = null;
        switch (choice) {
            case 1:
                System.out.println("Enter a radius: ");
                double radius = Double.parseDouble(sc.nextLine());
                s = new Circle(radius);

                break;
            case 2:
                System.out.println("Enter a base: ");
                double base = Double.parseDouble(sc.nextLine());
                System.out.println("Enter a height: ");
                double height = Double.parseDouble(sc.nextLine());
                s = new Triangle(base, height);

                break;
            case 3:
                System.out.println("Enter a length: ");
                double length = Double.parseDouble(sc.nextLine());
                System.out.println("Enter a width: ");
                double width = Double.parseDouble(sc.nextLine());
                s = new Rectangle(length, width);

                break;
            case 4:
                System.out.println("Enter a side: ");
                double side = Double.parseDouble(sc.nextLine());
                s = new Square(side);
        }

        if (s != null) {
            System.out.println("The area of the shape is " + s.getArea()); // s.getArea() is runtime polymorphism (aka method overriding)
            // We don't know what implementation for getArea will be used until runtime
            // It is up to the user to choose with Shape object they would like to use (Circle, Triangle, Rectangle, Square)
        } else {
            System.out.println("Invalid shape choice");
        }

    }
}
