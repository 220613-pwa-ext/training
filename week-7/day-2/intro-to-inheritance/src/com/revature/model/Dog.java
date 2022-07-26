package com.revature.model;

public class Dog extends Pet {

    // Every single constructor's first line of code is implicitly a call to super()
    // (unless you explicitly call super yourself)

    public Dog() {
        // super()
    }

    // Here we explicitly define a constructor, so therefore, we do not have a default no-args constructor provided
    public Dog(String name, int age) {
        super(name, age); // super(...) is used to invoke the parent class' constructor
    }

    public void playFetch() {
        System.out.println(this.name + " is playing fetch!");
    }

}
