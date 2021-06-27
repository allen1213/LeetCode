package com.example.simple;

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        int max = nums[0], min = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(max - nums[i]) == 1) {
                count ++;
                min = nums[i];
            }
            if (nums[i] > max && nums[i] - max == 1) max = nums[i];
            //if (nums[i] < min) min = nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence l = new LongestHarmoniousSubsequence();
        System.out.println(l.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }

}

/**
 * 594. 最长和谐子序列
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 * <p>
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,2,2,5,2,3,7]
 * 输出: 5
 * 原因: 最长的和谐数组是：[3,2,2,2,3].
 * 说明: 输入的数组长度最大不超过20,000.
 */
