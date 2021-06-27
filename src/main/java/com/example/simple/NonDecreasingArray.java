package com.example.simple;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1;i < nums.length && count <= 1;i ++) {
            if(nums[i-1] > nums[i])
                count ++;
            if(i >= 2 && nums[i-2] > nums[i])
                nums[i] = nums[i-1];
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{3,4,2,3}));
    }
}
/**

 665. 非递减数列
 给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。

 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，总满足 array[i] <= array[i + 1]。



 示例 1:

 输入: nums = [4,2,3]
 输出: true
 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 示例 2:

 输入: nums = [4,2,1]
 输出: false
 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。


 说明：

 1 <= n <= 10 ^ 4
 - 10 ^ 5 <= nums[i] <= 10 ^ 5

 */