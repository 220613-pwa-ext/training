package com.revature.main;

import com.revature.model.Pet;

public class Driver {

    public static void main(String[] args) {
        PetFactory pf = new PetFactory();

        Pet myPet = pf.createPet("dog", "Fido");
        myPet.play(); // Bob is playing fetch!

        myPet = pf.createPet("cat", "Whiskers");
        myPet.play(); // Bob is playing with yarn!
    }

}
