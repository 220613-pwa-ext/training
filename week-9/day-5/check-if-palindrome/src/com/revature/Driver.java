package com.revature;

public class Driver {

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("racecar"));
        System.out.println(checkIfPalindrome("car"));
    }

    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
