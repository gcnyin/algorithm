package com.github.gcnyin.algo.nextpermutation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test_12345() {
        Solution solution = new Solution();
        int[] ints = {1, 2, 3, 4, 5};
        solution.nextPermutation(ints);
        assertArrayEquals(new int[]{1, 2, 3, 5, 4}, ints);
    }

    @Test
    public void test_12543() {
        Solution solution = new Solution();
        int[] ints = {1, 2, 5, 4, 3};
        solution.nextPermutation(ints);
        assertArrayEquals(new int[]{1, 3, 2, 4, 5}, ints);
    }

    @Test
    public void test_54321() {
        Solution solution = new Solution();
        int[] ints = {5, 4, 3, 2, 1};
        solution.nextPermutation(ints);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ints);
    }

    @Test
    public void test_547532() {
        Solution solution = new Solution();
        int[] ints = {5, 4, 7, 5, 3, 2};
        solution.nextPermutation(ints);
        System.out.println(Arrays.toString(ints));
        assertArrayEquals(new int[]{5, 5, 2, 3, 4, 7}, ints);
    }

    @Test
    public void test_213() {
        Solution solution = new Solution();
        int[] ints = {1, 3, 2};
        solution.nextPermutation(ints);
        System.out.println(Arrays.toString(ints));
        assertArrayEquals(new int[]{2, 1, 3}, ints);
    }

    @Test
    public void test_4202320() {
        Solution solution = new Solution();
        int[] ints = {4, 2, 0, 2, 3, 2, 0};
        solution.nextPermutation(ints);
        System.out.println(Arrays.toString(ints));
        assertArrayEquals(new int[]{4, 2, 0, 3, 0, 2, 2}, ints);
    }
}