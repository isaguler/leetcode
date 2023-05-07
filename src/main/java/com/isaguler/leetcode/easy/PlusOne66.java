package com.isaguler.leetcode.easy;

import java.math.BigDecimal;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i : digits) {
            sb.append(i);
        }

        BigDecimal bd = new BigDecimal(sb.toString()).add(BigDecimal.ONE);

        int[] last = new int[bd.toString().length()];
        for (int i=0; i<bd.toString().length(); i++) {
            last[i] = bd.toString().charAt(i) - '0';
        }
        return last;
    }
}
