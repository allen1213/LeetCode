package com.example.simple;

/**
 * 打家劫舍
 *
 * 题解
 *
 * dp 方程 dp[i] = max(dp[i-2]+nums[i], dp[i-1])
 */
public class HouseRobber {

    /**
     * 官方题解
     *
     * f(k) = 从前 k 个房屋中能抢劫到的最大数额，A_iA
     * i
     * ​
     *   = 第 i 个房屋的钱数。
     *
     * 首先看 n = 1 的情况，显然 f(1) = A_1A
     * 1
     * ​
     *  。
     *
     * 再看 n = 2，f(2) = max(A_1A
     * 1
     * ​
     *  , A_2A
     * 2
     * ​
     *  )。
     *
     * 对于 n = 3，有两个选项:
     *
     * 抢第三个房子，将数额与第一个房子相加。
     *
     * 不抢第三个房子，保持现有最大数额。
     *
     * 显然，你想选择数额更大的选项。于是，可以总结出公式：
     *
     * f(k) = max(f(k – 2) + A_kA
     * k
     * ​
     *  , f(k – 1))
     *
     * 我们选择 f(–1) = f(0) = 0 为初始情况，这将极大地简化代码。
     *
     * 答案为 f(n)。可以用一个数组来存储并计算结果。不过由于每一步你只需要前两个最大值，两个变量就足够用了。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/house-robber/solution/da-jia-jie-she-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public static int robOne(int[] nums) {

        int preMax = 0;
        int curMax = 0;

        for (int n : nums) {
            int temp = curMax;
            curMax = Math.max(preMax + n,curMax);
            preMax = temp;
        }

        return curMax;
    }

    public static int rob(int[] nums) {

        if (nums.length <= 1) {
            return nums.length == 0 ? 0 : nums[0];
        }

        int[] a = new int[nums.length];

        a[0] = nums[0];
        a[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            a[i] = Math.max(nums[i] + a[i -2],a[i - 1]);
        }

        return a[a.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(robOne(nums));
    }

}
/**
 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

 示例 1:

 输入: [1,2,3,1]
 输出: 4
 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
      偷窃到的最高金额 = 1 + 3 = 4 。
 示例 2:

 输入: [2,7,9,3,1]
 输出: 12
 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
      偷窃到的最高金额 = 2 + 9 + 1 = 12 。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/house-robber
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */