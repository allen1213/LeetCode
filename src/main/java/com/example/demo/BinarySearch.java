package com.example.demo;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 第一种方式实现二分查找
     * @param nums
     * @param val
     * @return
     */
    public static int binarySearch(int[] nums,int val) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = high + low / 2;
            if (nums[mid] == val) {
                return mid;
            } else if (nums[mid] > val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 递归的方式实现二分查找
     * @param nums
     * @param val
     * @return
     */
    public static int recursionBinarySearch(int[] nums,int val,int low ,int high) {
        int mid = low + high / 2;
        if (low > high) {
            return -1;
        }

        if (nums[mid] == val) {
            return mid;
        } else if (nums[mid] > val) {
            return recursionBinarySearch(nums,val,low,mid - 1);
        } else {
            return recursionBinarySearch(nums,val,mid + 1,high);
        }

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(binarySearch(nums,0));
        System.out.println(recursionBinarySearch(nums,3,0,nums.length - 1));
    }
}
