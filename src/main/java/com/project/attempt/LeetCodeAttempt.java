package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(numberOfWaysToSplitArray(new int[]{10,4,-8,7}));

    }

    public static int numberOfWaysToSplitArray(int[] nums) {

        int validSplits = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int sum1 = 0;
            int sum2 = 0;

            for (int a = 0; a <= i + 1; a++) {
                sum1 += nums[a];
            }

            for (int b = nums.length - i - 1; b < nums.length; b++) {
                sum2 += nums[b];
            }

            if (sum1 >= sum2) { validSplits++; }

        }

        return validSplits;

    }

}
