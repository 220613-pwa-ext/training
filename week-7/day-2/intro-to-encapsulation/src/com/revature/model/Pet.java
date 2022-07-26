package com.revature.model;

public class Pet {

    // Private non-static fields (instance scoped variables)
    private String name;
    private int age;

    // no-args constructor
    public Pet() {
    }

    // Parameterized constructor
    public Pet(String name, int age) { // name and age are method scoped variables
        this.name = name; // this.name is an instance scoped variable that is private
        this.age = age; // this.age is an instance scoped variable that is private
    }

    // Getters/setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
