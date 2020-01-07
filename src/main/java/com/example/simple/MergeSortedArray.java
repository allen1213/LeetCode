package com.example.simple;

/**
 * 合并两个有序数组
 */
public class MergeSortedArray {

    /**  解法一 ： 利用双指针  从前往后 和 数组一的拷贝数组
     * 这种解法的空间复杂度为O(n)  时间复杂度 : O(n + m)
     *
     * -1-  先拷贝一份数组一中的元素
     * -2-  拿拷贝数组中的值  和  数组二 中的值 做比较 ，小的放到 数组一中，对应的数组下标 ++
     * -3-  若循环结束，拷贝数组或者数组二中还有元素，就直接添加到数组一中，因为数组是有序的
     *
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void mergeOne(int[] nums1, int m, int[] nums2, int n) {
        //方法一  先合并两个数组，然后排序
        //System.arraycopy(nums2, 0, nums1, m, n);

        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        //System.arraycopy(nums2, 0, nums1, 0, len2 + 1);

        /*int[] copy = new int[m];
        System.arraycopy(nums1,0,copy,0,m);

        int p = 0,p1 = 0,p2 = 0;

        while ( p1 < m && p2 < n) {
            if (copy[p1] < nums2[p2]) {
                nums1[p] = copy[p1];
                p1 ++;
            } else {
                nums1[p] = nums2[p2];
                p2 ++;
            }
            p ++;
        }

        //若 copy  或者  nums2中仍然有 元素剩余
        if (p1 < m) {
            System.arraycopy(copy,p1,nums1,p1+p2,m - p1);
        }

        if (p2 < n) {
            System.arraycopy(nums2,p2,nums1,p1+p2,n - p2);
        }*/

        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = 0;
        int p2 = 0;

        int p = 0;

        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);


    }

    /**
     * 解法二  利用双指针  从后往前   空间复杂度为O(1)  时间复杂度 : O(n + m)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        }

        System.arraycopy(nums2,0,nums1,0,p2 + 1);


    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "  ");
        }
    }
}

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
