package com.revature.model;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Cat is about to play: ");
        System.out.println(this.name + " is playing with yarn!");
    }

}
