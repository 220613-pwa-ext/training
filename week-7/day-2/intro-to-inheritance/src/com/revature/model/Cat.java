package com.revature.model;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age); // super(...) is used to invoke the parent class' constructor
    }

    public void playWithYarn() {
        System.out.println(this.name + " is playing with yarn!");
    }

}
