package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicates {

    private static int[] nums = new int[] {1, 4};

    public static boolean containsDuplicate(int[] nums) {

        var set = new HashSet<>();
        var map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], 1);
        }


//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(nums));
    }
}
