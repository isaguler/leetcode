package com.isaguler.leetcode.easy;

public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target) {
        int a = 0;

        if(nums == null || nums.length == 0 || target < nums[0]) {
            return a;
        }

        if(target > nums[nums.length - 1]) {
            return nums.length;
        }

        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                a = i;
                break;
            } else if(i < nums.length - 1 && target > nums[i] && target < nums[i + 1]) {
                a = i + 1;
                break;
            }
        }

        return a;
    }
}
