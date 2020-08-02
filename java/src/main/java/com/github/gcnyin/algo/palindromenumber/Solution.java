package com.github.gcnyin.algo.palindromenumber;

class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }
}
