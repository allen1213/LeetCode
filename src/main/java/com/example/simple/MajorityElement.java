package com.example.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 多数元素
 */
public class MajorityElement {

    /**
     * 投票算法（97%，84%）【适用于1/2情况】
     * 从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，
     * 减到0就重新换个数开始计数，总能找到最多的那个
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }

    /**
     * 使用HashMap 的方式
     *
     * 有则添加，重复出现时count ++  最后遍历map  返回entry.getKey()
     *
     * @param nums
     * @return
     */
    public static int majorityElementHashOne(int[] nums) {
        int count = 1;
        int res = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer integer = map.get(num);
                map.put(num,++ integer);
            } else {
                map.put(num,count);
            }

        }
        Map.Entry<Integer,Integer> resMap = null;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > res) {
                res = entry.getValue();
                resMap = entry;
            }
        }
        return resMap.getKey();
    }

    /**
     * 使用HashMap 的第二种方式
     * @param nums
     * @return
     */
    public static int majorityElementHashTwo(int[] nums) {
        int maxNum = 0;
        int maxCount = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num,count);
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};//2,2,1,1,1,2,2
        System.out.println(majorityElementHashTwo(nums));
    }

}
/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
