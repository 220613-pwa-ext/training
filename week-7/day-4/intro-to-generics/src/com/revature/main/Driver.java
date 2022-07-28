package com.revature.main;

import com.revature.datastructures.Tuple;

public class Driver {

    public static void main(String[] args) {
        Tuple<Integer> myIntTuple = new Tuple<>(1, 2, 3, 10, 15);
        int x = myIntTuple.get(1);

        Tuple<Double> myDoubleTuple = new Tuple<>(3.1415, 1.5, 3.32, 1.54);
        double y = myDoubleTuple.get(3);

        // Primitives
        // byte -> Byte
        // short -> Short
        // char -> Character
        // int -> Integer
        // long -> Long
        // double -> Double
        // float -> Float
        // boolean -> Boolean

        // Wrapper classes
        // Byte
        // Short
        // Character
        // Integer
        // Long
        // Double
        // Float
        // Boolean

        // Wrapper classes serve as blueprints for wrapper objects
        // A wrapper object is an object that "wraps" around a primitive
        // It allows for us to treat primitives as objects rather than primitives
        // This is particularly important when it comes to utilizing generics, since generics only apply to object types

        // Within the collections API, generics are heavily used
        // Lists, Sets, Maps, Queues all need to have a certain datatype specified that we would like to store
        // Therefore generics are utilized

        // Autoboxing and unboxing: Java automatically handles conversion between primitives and wrapper objects
        // so we don't need to worry about that ourselves
        // Autoboxing: automatic conversion from primitive to object
        // Unboxing: automatic conversion from object to primitive

        Integer i1 = 10; // Autoboxing -> we are taking primitive int 10 and creating a wrapper object
        int a = i1; // Unboxing -> we are taking wrapper object i1 and extracting primitive int from it and then assigning that
        // to a (int)

        Integer i2 = 5;
        Integer i3 = 7;
        System.out.println(i2 + i3); // i2 and i3 are being unboxed into primitives and added together

        Integer i4 = i2 + i3; // i2 + i3 are being unboxed, added together, and then the sum is being autoboxed into Integer i4
    }

}
