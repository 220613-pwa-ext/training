package com.revature.model;

public class Pet {

    public void play() {
        System.out.println("This is a generic Pet object, so we don't know how it plays");
    }

    // Method overloading
    public void eat() {
        System.out.println("Pet is eating!");
    }
    // Method overloading
    public void eat(String food) {
        System.out.println("Pet is eating " + food + "!");
    }

    public void eat(int x) {
        System.out.println("Pet is eating " + x + " quantities");
    }

    public void eat(String food, int x) {
        System.out.println("Pet is eating " + x + " quantities of " + food);
    }

}
