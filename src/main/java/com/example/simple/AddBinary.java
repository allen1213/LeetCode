package com.example.simple;

/**  二进制求和
 *
 * 题解
 * -1-  将两个字符串较短的用 0 补齐，使得两个字符串长度一致
 * -2-  然后从末尾进行遍历计算，得到最终结果
 * -3-  补齐的做法：对两个字符串从末尾开始遍历，i -- j -- ，当 i 或者 j < 0 时，就加上0
 * -4-  sum 只记录 两个字符串一位 的和  然后在 %2 得到相应位的 和
 * -5-  count 用来判断是否有进位  1 代表进位 0 代表没有进位
 * -6-  进位之后，前一位要加上1 ，所以在循环下一位开始时，就要把count的值赋值给 sum
 * -7- 若计算到最后一个还有进位的话，在添加一个1
 * -8-  由于计算是从最后一位开始，所以得到的字符串是反的，最后要返回reverse
 *
 */
public class AddBinary {
    public static String addBinary(String a, String b) {

        StringBuilder builder = new StringBuilder();
        //判断是否有进位，只有 1 和 0 两个值
        int count = 0;
        // 从两个字符串的最后一个开始
        for (int i = a.length()-1,j = b.length()-1; i >=0 || j >= 0; i --,j--) {

            //进位为 1  不进位为 0
            int sum = count;

            //判断字符串长度是否已经结束，即短的字符串补 0
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;

            //得到相加后的结果
            builder.append(sum % 2);
            //进位
            count = sum / 2;
        }

        builder.append(count == 1 ? count : "");
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }
}

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
