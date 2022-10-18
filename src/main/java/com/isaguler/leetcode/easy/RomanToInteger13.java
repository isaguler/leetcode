package com.isaguler.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class RomanToInteger13 {

    public int romanToInt(String s) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            switch (String.valueOf(s.charAt(i))) {
                case "I" -> numbers.add(1);
                case "V" -> numbers.add(5);
                case "X" -> numbers.add(10);
                case "L" -> numbers.add(50);
                case "C" -> numbers.add(100);
                case "D" -> numbers.add(500);
                case "M" -> numbers.add(1000);
            }
        }

        int result = 0;

        for(int i = 0; i < numbers.size() -1; i++) {
            if(numbers.get(i) < numbers.get(i + 1)) {
                result = result - numbers.get(i);
            } else {
                result = result + numbers.get(i);
            }
        }

        return result + numbers.get(numbers.size() - 1);
    }
}
