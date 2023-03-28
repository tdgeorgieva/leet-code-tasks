package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicates {

    private static int[] nums = new int[] {1, 4};

    public static boolean containsDuplicate(int[] nums) {

        var set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(nums));
    }
}
