package com.revature.model;

public class Pet /* extends Object (implicit) */ {

    public String name;
    public int age;

    // User defined no-args constructor
    public Pet() {
        // super();
    }

    // User defined parameterized constructor
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printBasicInfo() {
        System.out.println("name=" + this.name + " , age=" + this.age);
    }

}
