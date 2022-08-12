package com.revature;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        printWordFrequencies("the dog went with another dog to play with the cat");
    }

    public static void printWordFrequencies(String sentence) {
        String[] words = sentence.split(" "); // splitting by a space

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (wordFrequency.containsKey(words[i])) {
                wordFrequency.put(words[i], wordFrequency.get(words[i]) + 1);
            } else {
                wordFrequency.put(words[i], 1);
            }
        }

        for (String key : wordFrequency.keySet()) {
            System.out.println(key + " : " + wordFrequency.get(key));
        }
    }

}
