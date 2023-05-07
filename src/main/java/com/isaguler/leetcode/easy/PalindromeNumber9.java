package com.isaguler.leetcode.easy;

public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
        StringBuilder input = new StringBuilder();
        input.append(x);
        input.reverse();

        return input.toString().equals(String.valueOf(x));
    }
}
