package com.example.simple;

import java.util.TreeSet;

public class ThirdMaximumNumber {

    /**
     * 维护一个只有3个元素的TreeSet，如果大于三个元素就就把Set中的最小最小值remove掉。
     * 最后如果Set中元素小于3就返回Set最大值，否则返回最小值。
     * @param nums
     * @return
     */
    public static int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();
        for (Integer elem : nums) {
            set.add(elem);
            if (set.size() > 4) set.remove(set.first());
        }
        return set.size() < 4 ? set.last() : set.first();   // set.last() 里面最大的元素

    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2, 2, 3, 1,0,-1}));
    }
}

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
