package com.example.simple;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;
        for (int num : nums) {
            if (num == 1) count ++;
            else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1,1, 1, 0, 1, 1, 1}));
    }
}
