package com.example.simple;

public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {

        int countA = 0, countL = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'A') {
                countA++;
                countL = 0;
            } else if (c == 'L')
                countL++;
            else
                countL = 0;

            if (countA >= 2 || countL >= 3) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new StudentAttendanceRecordI().checkRecord("PPALLP"));
    }
}
/**
 * 551. 学生出勤记录 I
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * <p>
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * <p>
 * 你需要根据这个学生的出勤记录判断他是否会被奖赏。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "PPALLP"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "PPALLL"
 * 输出: False
 */
