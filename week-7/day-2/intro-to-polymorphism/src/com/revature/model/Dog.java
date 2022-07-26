package com.revature.model;

public class Dog extends Pet {

    // Method overriding
    @Override
    public void play() {
        System.out.println("The dog is playing fetch!");
    }

}
