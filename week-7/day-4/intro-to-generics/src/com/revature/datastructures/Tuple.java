package com.revature.datastructures;

import java.util.Arrays;

public class Tuple<E> { // <E> is a generic

    private E[] arr; // E could be Pet, Dog, Cat, "int", "double", etc.

    public Tuple(E... args) { // var-args
        arr = (E[]) new Object[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }
    }

    public E get(int index) {
        return arr[index];
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr); // the toString method on the Arrays class is a STATIC method. It's not the same
        // as Object's toString method (which is an instance method). So do not confuse the two methods
    }

}
