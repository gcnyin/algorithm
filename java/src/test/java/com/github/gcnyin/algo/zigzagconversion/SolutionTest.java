package com.github.gcnyin.algo.zigzagconversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void convert() {
        Solution solution = new Solution();
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        assertEquals("A", solution.convert("A", 1));
        assertEquals("AB", solution.convert("AB", 1));
    }
}