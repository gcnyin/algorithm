package com.github.gcnyin.algo.longestpalindromicsubstring;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String result = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String tmp = "";
            for (int j = i + 1; j <= length; j++) {
                String sub = s.substring(i, j);
                String reversedSub = new StringBuffer(sub).reverse().toString();
                if (sub.equals(reversedSub)) {
                    tmp = sub.length() > tmp.length() ? sub : tmp;
                }
            }
            result = tmp.length() > result.length() ? tmp : result;
        }
        return result;
    }
}
