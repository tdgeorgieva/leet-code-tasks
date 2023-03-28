package com.leetcode;

public class MaximumSubarray {

    public static int[] nums = new int[] {1};

    private static int maxSoFar = Integer.MIN_VALUE;
    private static int maxEndingHere = 0;

    public static int maxSubArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere = maxEndingHere + nums[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(nums));
    }
}
