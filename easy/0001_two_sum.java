/**
 * LeetCode Problem #1: Two Sum
 * Difficulty: Easy
 *
 * Given an array of integers nums and an integer target, return indices
 * of the two numbers such that they add up to target.
 *
 * URL: https://leetcode.com/problems/two-sum/
 */

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate over each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Compare it with every other integer (nested loop)
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum equals the target, return the indices
                if (nums[i] + nums[j] == target) {
                    int matchingIndices[] = new int[]{i, j};
                    return matchingIndices;
                }
                // Otherwise, continue checking the next number
            }
            // If end of array is reached, move to next starting number
        }
        // If no solution found, return empty array
        return new int[]{};
    }
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] result = solver.twoSum(new int[]{2, 5, 11, 15}, 13);
        System.out.println(Arrays.toString(result));
    }
}

