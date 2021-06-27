package com.example.simple;

/**
 * 旋转数组
 *
 * 题解
 */
public class RotateArray {

    /**
     * 解法一  暴力破解
     * 旋转k次，每次旋转一个元素
     *
     * 时间复杂度：O(n*k) 。每个元素都被移动 1 步（O(n)） k次（O(k)） 。
     * 空间复杂度：O(1) 。没有额外空间被使用。
     *
     *
     * @param nums
     * @param k
     */
    public static void rotateOne(int[] nums, int k) {

        for (int i = 0; i < k ; i ++) {
            int pre = nums[nums.length - 1];
            for (int j = 0 ; j < nums.length; j ++) {
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }

        }



    }

    /**
     * 解法二   用新数组替换
     * 用一个额外的数组来将每个元素放到正确的位置上，
     * 也就是原本数组里下标为 ii的我们把它放到 (i+k)%数组长度(i+k)%数组长度 的位置。
     * 然后把新的数组拷贝到原数组中。
     *
     *时间复杂度：O(n)
     *空间复杂度：O(n)
     * @param nums
     * @param k
     */
    public static void rotateTwo(int[] nums, int k) {
        int[] a = new int[nums.length];

        for (int i = 0; i < a.length; i++) {
            a[(i + k) % a.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];

        }
    }

    /**
     * 解法三   反转
     *
     * 当我们旋转数组 k 次，k%n 个尾部元素会被移动到头部，剩下的元素会被向后移动。
     *
     * 我们首先将所有元素反转
     * 然后反转前 k 个元素，
     * 再反转后面 n-k 个元素，就能得到想要的结果。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/rotate-array/solution/xuan-zhuan-shu-zu-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     *时间复杂度：O(n)
     *空间复杂度：O(1)
     * @param nums
     * @param k
     */
    public static void rotateThree(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        int count = 0;

        for (int start = 0; count < nums.length; start++) {

            int cur = start;
            int pre = nums[start];
            do {
                int next = (cur + k) % nums.length;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                cur = next;
                count ++;
            } while (start != cur);

        }

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
    }
}
/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
