package com.example.simple;

public class StringCompression {

    public int compress(char[] chars) {

        if (chars == null || chars.length == 0) return 0;

        int i = 0, j = 1;
        int count = 1;
        while (i < chars.length) {

            while (i + 1 < chars.length && chars[i] == chars[i+1]) {
                count ++;
                i ++;
            }

            if (count >= 10) {
                /*while (count != 0) {
                    chars[j++] = (char) ((count / 10) + '0');
                    count = count / 10;
                }*/

                String s = String.valueOf(count);
                for (int k = 0; k < s.length(); k++) {
                    chars[j++] = s.charAt(k);
                }

            } else if (count > 1){
                chars[j++] = (char) (count + '0');
            }

            if (i == chars.length - 1) break;
            chars[j++] = chars[++i];

            count = 1;

        }

        return j;
    }

    public static void main(String[] args) {
        StringCompression s = new StringCompression();

        System.out.println(s.compress("abbbbbbbbbbbbbbbbb".toCharArray()));
    }


}

/**
 * 443. 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 * <p>
 * 压缩后的长度必须始终小于或等于原数组长度。
 * <p>
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * <p>
 * 在完成原地修改输入数组后，返回数组的新长度。
 * <p>
 * <p>
 * <p>
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * <p>
 * 输出：
 * 返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
 * <p>
 * 说明：
 * "aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
 * 示例 2：
 * <p>
 * 输入：
 * ["a"]
 * <p>
 * 输出：
 * 返回 1 ，输入数组的前 1 个字符应该是：["a"]
 * <p>
 * 解释：
 * 没有任何字符串被替代。
 * 示例 3：
 * <p>
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * <p>
 * 输出：
 * 返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。
 * <p>
 * 解释：
 * 由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
 * 注意每个数字在数组中都有它自己的位置。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 所有字符都有一个ASCII值在[35, 126]区间内。
 * 1 <= len(chars) <= 1000。
 */
