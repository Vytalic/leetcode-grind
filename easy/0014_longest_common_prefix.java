/**
 * LeetCode Problem #14: Longest Common Prefix
 * Difficulty: Easy
 *
 * Write a function to find the longest common prefix string amongst an array of strings
 * If there is no common prefix, return an empty string "".
 *
 * URL: https://leetcode.com/problems/longest-common-prefix/description/
 */


class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start with first string as longest common prefix
        String prefix = strs[0];

        // Compare it with each string in array
        for (int i = 0; i < strs.length; i++) {
            // Make it shorter until a match is found
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // Return empty string if nothing in common
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String result = test.longestCommonPrefix(new String[]{"Flower", "Flow", "Flight"});
        System.out.println(result);
    }
}