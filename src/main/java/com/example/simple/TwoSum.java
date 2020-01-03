package com.example.simple;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums,target);
    }

    /**
     *   解题思路
     *   -1-  定义一个长度为2的数组a 和  map
     *   -2-  遍历 参数中的 nums 数组， map 放入 目标数 - nums[i]  ->  i
     *   -3-  如果 nums[i]  与  map 中的key 重复 ，则结束
     *   -4-  此时 a 数组中  存放 map.get(nums[i])  以及 i  ，即返回的结果
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums,int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(target - nums[i],i);
        }
        return result;

    }

//    private static void twoSum(int[] nums,int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    System.out.println(i + "  " +j);
//                    break;
//                }
//            }
//        }
//
//    }

}
/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */