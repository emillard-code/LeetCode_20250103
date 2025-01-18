package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(numberOfWaysToSplitArray(new int[]{10,4,-8,7}));

        System.out.println(numberOfWaysToSplitArray(new int[]{2,3,1,0}));

    }

    // This method will try to find the number of valid splits as per challenge instructions.
    public static int numberOfWaysToSplitArray(int[] nums) {

        // We will store the number of valid splits in validSplits.
        int validSplits = 0;

        // We will do a basic for loop to iterate throughout the array. We skip the last index as
        // the challenge instructions specify there must always be at least one number to the right.
        for (int i = 0; i < nums.length - 2; i++) {

            // sum1 will be the sum of the first (i + 1) elements.
            // sum2 will be the sum of the last (n - i - 1) elements.
            int sum1 = 0;
            int sum2 = 0;

            // We calculate the sum1 value for the current index i.
            for (int a = 0; a <= i + 1; a++) {
                sum1 += nums[a];
            }

            // We calculate the sum2 value for the current index i.
            for (int b = nums.length - i - 1; b < nums.length; b++) {
                sum2 += nums[b];
            }

            // If the current index i can produce a valid split according
            // to challenge specifications, we increment validSplits by 1.
            if (sum1 >= sum2) { validSplits++; }

        }

        // When done iterating through all possible indexes, return number of valid splits.
        return validSplits;

    }

}
