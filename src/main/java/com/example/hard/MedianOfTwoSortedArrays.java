package com.example.hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int []result=new int[nums1.length+nums2.length];
        int index=0;
        //1.把两个数组数合成一个数组
        for (int i = 0; i < nums1.length; i++) {
            result[index]=nums1[i];
            index++;
        }
        for (int i = 0; i < nums2.length; i++) {
            result[index]=nums2[i];
            index++;
        }
        //2.进行排序
        Arrays.sort(result);
        //3.计算出中位数
        double iszhong = iszhong(result);
        return iszhong;
    }
    public static double iszhong(int[]nums2) {
        Arrays.sort(nums2);
        if(nums2.length%2==0) { //说明是偶数位
            int num=(nums2.length/2)-1;
            int num2=nums2.length/2;
            int indexs1 = nums2[num];
            int indexs2 = nums2[num2];
            double results = (double)(indexs1+indexs2)/2;
            return results;
        }
        //奇数位
        int index=nums2.length/2;
        double result = nums2[index];
        return result;
    }

    public static void main(String[] args) {
        /*int[] nums1 = {20,21,23,23};
        int[] nums2 = {25,29,32,33};*/
        int[] nums1 = {10, 20, 20};
        int[] nums2 = {20, 30};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    /**
     *
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     *
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空。
     *
     * 示例 1:
     *
     * nums1 = [1, 3]
     * nums2 = [2]
     *
     * 则中位数是 2.0
     * 示例 2:
     *
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     *
     * 则中位数是 (2 + 3)/2 = 2.5
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */
}
