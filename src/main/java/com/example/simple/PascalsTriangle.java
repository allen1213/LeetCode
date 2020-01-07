package com.example.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        int[][] a = new int[numRows][numRows];

        for (int i = 0; i < a.length; i++) {

            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
                rowList.add(a[i][j]);
            }
            list.add(rowList);
        }

        return list;

    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
