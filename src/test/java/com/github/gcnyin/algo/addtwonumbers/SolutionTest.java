package com.github.gcnyin.algo.addtwonumbers;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void addTwoNumbers() {
        var solution = new Solution();
        var node = solution.addTwoNumbers(solution.createFrom(new int[]{2, 4, 3}), solution.createFrom(new int[]{5, 6, 4}));
        assertEquals("ListNode{val=7, next=ListNode{val=0, next=ListNode{val=8, next=null}}}", node.toString());
        var node2 = solution.addTwoNumbers(solution.createFrom(new int[]{9}), solution.createFrom(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9}));
        assertEquals("ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, " +
                        "next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, " +
                        "next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=1, next=null}}}}}}}}}}}",
                node2.toString());
    }

    @Test
    public void createFrom() {
        var solution = new Solution();
        var node = solution.createFrom(new int[]{1, 2, 3});
        assertEquals("ListNode{val=1, next=ListNode{val=2, next=ListNode{val=3, next=null}}}", node.toString());
        node = solution.createFrom(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        assertEquals("ListNode{val=1, next=ListNode{val=9, next=ListNode{val=9, " +
                "next=ListNode{val=9, next=ListNode{val=9, next=ListNode{val=9, next=ListNode{val=9, " +
                "next=ListNode{val=9, next=ListNode{val=9, next=ListNode{val=9, next=null}}}}}}}}}}", node.toString());
    }

    @Test
    public void extractNumber() {
        var solution = new Solution();
        assertEquals(BigDecimal.valueOf(321), solution.extractNumber(solution.createFrom(new int[]{1, 2, 3})));
        assertEquals(BigDecimal.valueOf(9999999991L), solution.extractNumber(solution.createFrom(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9})));

        int[] intArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        var node3 = solution.addTwoNumbers(solution.createFrom(intArray), solution.createFrom(new int[]{5, 6, 4}));
        assertEquals(new BigDecimal("1000000000000000000000000000466"), solution.extractNumber(node3));
    }
}