package com.github.gcnyin.algo.nextpermutation;

import java.util.Arrays;
import java.util.Objects;

class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int cursor = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int nextCursor = nums[j];
                if (cursor > nextCursor) {
                    nums[i] = nextCursor;
                    nums[j] = cursor;
                    Arrays.sort(nums, j + 1, nums.length);
                    return;
                }
            }
        }
        reserve(nums, 0, nums.length - 1);
    }

    private void reserve(int[] nums, int i, int j) {
        int k = 0;
        while (true) {
            int l = i + k;
            int m = j - k;
            if (Objects.equals(l, m) || l > m) {
                break;
            }
            int tmp = nums[l];
            nums[l] = nums[m];
            nums[m] = tmp;
            k++;
        }
    }
}
