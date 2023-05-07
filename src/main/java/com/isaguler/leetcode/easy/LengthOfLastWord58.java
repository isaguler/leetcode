package com.isaguler.leetcode.easy;

public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if(chars[i] != ' ') {
                length++;
            } else {
                if (length > 0) {
                    return length;
                }
            }
        }

        return length;
    }
}
