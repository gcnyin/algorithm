package com.github.gcnyin.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TowSumTest {
    @Test
    public void testTwoSum() {
        TowSum towSum = new TowSum();
        int[] result = towSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
