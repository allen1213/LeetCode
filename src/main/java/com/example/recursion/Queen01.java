package com.example.recursion;

public class Queen01 {
    static int count;
    private static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    //检查前n个皇后是否和当前的皇后冲突
    public static boolean isRight(int[] a,int n) {
        for (int i = 0; i < n; i++) {
            //a[i] == a[n]  表示在同一列上
            //Math.abs(n - i) == Math.abs(a[n] - a[i])   表示在对角线上
            if (a[i] == a[n] || Math.abs(n - i) == Math.abs(a[n] - a[i]))
                return false;
        }
        return true;
    }

    public static void check(int[] a,int n) {
        //若n的值已经为数组的长度，说明8个皇后已经摆放完成，输出一种可能
        if (n == a.length) {
            print(a);
            count ++;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            //第n个皇后从第0个位置开始放，检查是否冲突,若有冲突，此处则为回溯
            a[n] = i;
            if (isRight(a, n)) {
                check(a,n + 1);
            }
        }
    }

    public static void main(String[] args) {
        int max = 8;
        int[] a = new int[max];
        check(a,0);
        System.out.println(count);
    }
}
