/**
 * LeetCode Problem #28: Find the index of the first occurence in a string
 * Difficulty: Easy
 *
 * Given two strings needle and haystack, return the index of the first occurrence of
 * needle in haystack, or -1 if needle is not part of haystack.
 *
 * URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 */

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Sliding window technique with withdow size of |i           i+(needle.length()|
            if (haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int result = test.strStr(new String("Hilling"), new String("ill"));
        System.out.println(result);
    }

}