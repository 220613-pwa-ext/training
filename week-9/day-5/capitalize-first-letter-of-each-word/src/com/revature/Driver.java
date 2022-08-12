package com.revature;

public class Driver {

    public static void main(String[] args) {
        String answer = capitalizeFirstLetterWords("the dog went with another dog to play with the cat");
        System.out.println(answer);
    }

    public static String capitalizeFirstLetterWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char c = word.charAt(0); // first letter of word
            c = Character.toUpperCase(c);
            String restOfTheString = word.substring(1); // starting at 1 going to the end of the string
            String capitalizedWord = c + restOfTheString;

            if (i == words.length - 1) {
                sb.append(capitalizedWord);
            } else {
                sb.append(capitalizedWord + " ");
            }
        }

        return sb.toString();
    }

}
