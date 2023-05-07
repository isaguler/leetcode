package com.isaguler.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] last = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            last[i] = i < m ? nums1[i] : nums2[i - m];
        }
        Arrays.sort(last);

        if (m + n >= 0) System.arraycopy(last, 0, nums1, 0, m + n);
    }
}
