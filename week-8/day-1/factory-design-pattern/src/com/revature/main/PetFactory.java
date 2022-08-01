package com.revature.main;

import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Pet;

public class PetFactory {

    public Pet createPet(String petType, String name) {
        if (petType.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (petType.equalsIgnoreCase("cat")) {
            return new Cat(name);
        }

        return null;
    }

}
