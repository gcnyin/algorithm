package com.github.gcnyin.algo.longestsubstringwithoutrepeatingcharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        Solution solution = new Solution();
        assertEquals( 2, solution.lengthOfLongestSubstring("au"));
        assertEquals( 2, solution.lengthOfLongestSubstring("aab"));
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}