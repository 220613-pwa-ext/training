package com.revature.model;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Dog is about to play: ");
        System.out.println(this.name + " is playing fetch!");
    }
}
