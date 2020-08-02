package com.github.gcnyin.algo.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            lists.add(new StringBuilder());
        }
        for (int index = 0, columnNum = 0; index < s.length(); columnNum++) {
            if (columnNum % (numRows - 1) == 0) {
                for (int i = 0; i < numRows && index < s.length(); i++, index++) {
                    lists.get(i).append(s.charAt(index));
                }
            } else {
                lists.get(numRows - columnNum % (numRows - 1) - 1).append(s.charAt(index));
                index++;
            }
        }
        return String.join("", lists);
    }
}
