package com.github.gcnyin.algo.longestsubstringwithoutrepeatingcharacters;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int startIndex = 0;
        int endIndex = 1;
        int result = 0;
        for (; endIndex < s.length(); endIndex++) {
            char c = s.charAt(endIndex);
            String sub = s.substring(startIndex, endIndex);
            int indexOf = sub.indexOf(c);
            if (indexOf >= 0) {
                result = Math.max(result, endIndex - startIndex);
                startIndex += indexOf + 1;
            }
            result = Math.max(result, endIndex - startIndex);
        }
        result = Math.max(result, endIndex - startIndex);
        return result;
    }
}
