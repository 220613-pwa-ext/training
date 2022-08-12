package com.revature.main;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        String output = rearrangeLetters("aadccgzzssoe");

        System.out.println(output);
    }

    public static String rearrangeLetters(String s) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1); // Increment the value by 1 for a given key
            } else {
                characterCounts.put(c, 1);
            }
        }

        List<Character> characters = new ArrayList<>();
        for (Character key: characterCounts.keySet()) {
            if (characterCounts.get(key) == 2) {
                characters.add(key);
                characters.add(key);
            }
        }

        Collections.sort(characters);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < characters.size(); i++) {
            sb.append(characters.get(i));
        }

        return sb.toString();
    }
}
