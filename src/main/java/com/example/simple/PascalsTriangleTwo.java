package com.example.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角二
 */
public class PascalsTriangleTwo {

    /**
     * 获取杨辉三角的指定行
     * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
     * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
     */
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>(rowIndex + 1);

        long cur = 1;

        for (int i = 0; i <= rowIndex; i++) {

            res.add((int) cur);

            cur = cur * (rowIndex - i) / (i + 1);

        }

        return res;
    }

    public static void main(String[] args) {
        getRow(5);
    }
}

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
