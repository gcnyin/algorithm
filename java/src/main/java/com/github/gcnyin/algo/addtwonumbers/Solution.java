package com.github.gcnyin.algo.addtwonumbers;

import java.math.BigDecimal;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807
 */
class Solution {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var n1 = extractNumber(l1);
        var n2 = extractNumber(l2);
        var split = new StringBuilder(String.valueOf(n1.add(n2))).reverse().toString().split("");
        var ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        return createFrom(ints);
    }

    BigDecimal extractNumber(ListNode node) {
        var result = BigDecimal.ZERO;
        var h = node;
        for (var i = 0; ; i++) {
            if (h == null) {
                break;
            }
            result = result.add(pow(i).multiply(BigDecimal.valueOf(h.val)));
            h = h.next;
        }
        return result;
    }

    BigDecimal pow(int b) {
        return BigDecimal.TEN.pow(b);
    }

    ListNode createFrom(int[] intArray) {
        if (intArray.length == 0) {
            return null;
        }
        ListNode root = new ListNode(intArray[0]);
        ListNode head = root;
        for (int i = 1; i < intArray.length; i++) {
            head.next = new ListNode(intArray[i]);
            head = head.next;
        }
        return root;
    }
}
