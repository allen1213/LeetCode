package com.example.simple;

public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int i = 0,j = nums.length - 1;
        int min = nums[i],max = nums[j];
        int minIndex = i, maxIndex = j;
        while (i <= j) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = 0;
            }

            if (nums[j] > max) {
                max = nums[j];
                maxIndex = nums.length - 1;
            }
            i ++;
            j --;

        }
        return maxIndex - minIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
/**
 * 581. 最短无序连续子数组
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 你找到的子数组应是最短的，请输出它的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 * <p>
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 */