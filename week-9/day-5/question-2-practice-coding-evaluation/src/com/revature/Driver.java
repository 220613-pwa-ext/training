package com.revature;

import java.util.HashSet;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        System.out.println(reduceString("bcaeecbf")); // bcaef
    }

    public static String reduceString(String s) {
        Set<Character> characterTracker = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!characterTracker.contains(s.charAt(i))) { // ! NOT operator
                sb.append(s.charAt(i));
            }

            characterTracker.add(s.charAt(i));
        }

        return sb.toString();
    }

}
