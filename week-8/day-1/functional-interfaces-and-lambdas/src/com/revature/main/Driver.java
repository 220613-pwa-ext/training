package com.revature.main;

import com.revature.functionalinterfaces.StringModifierFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {

        // Anonymous class: a class with no name that is provided right at the moment of object instantiation
        StringModifierFunctionalInterface myObj = new StringModifierFunctionalInterface() {
            @Override
            public String perform(String s) {
                return s + "!!!!!";
            }
        };

        StringModifierFunctionalInterface myObj2 = (String s) -> {
            return s + "!!!!!";
        };


        System.out.println(myObj.perform("Hello world"));
        System.out.println(myObj2.perform("Hello world"));

        List<String> myStrings = new ArrayList<>();
        myStrings.add("Hello");
        myStrings.add("Hi");
        myStrings.add("Greetings");

        // Map, filter and reduce are core ideas within functional programming
        // map
        List<String> myTransformedStrings = myStrings.stream().map((s) -> s + "!!!!").collect(Collectors.toList()); // O(n)

        System.out.println(myStrings);
        System.out.println(myTransformedStrings);

        // filter
        List<String> myShortGreetings = myStrings.stream().filter((s) -> s.length() < 5).collect(Collectors.toList()); // O(n)

        System.out.println(myShortGreetings); // keeping all of the greetings whose string length is less than 5

        // reduce
        // both map and reduce
        // map: take each individual string to turn it into lengths instead
        // reduce: take each length and add it into the accumulator
        int totalLengthOfAllGreetings = myStrings.stream().map((s) -> s.length()).reduce(0, (accumulator, element) -> accumulator + element);
        System.out.println(totalLengthOfAllGreetings);
    }

}
