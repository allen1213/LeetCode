package com.example.simple;

/**  最大子序和
 *
 * 题解
 * 关键在于当一段字段的值小于 0 时，如何处理
 * 这里 当 count 的值小于 0  时， count 的值 赋值为 0
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int count = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > max) {
                max = count;
            }
            if (count < 0) {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-3,-4,-1,0,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));
    }
}

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
