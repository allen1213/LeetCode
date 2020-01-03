package com.example.simple;

import java.util.Stack;

/**
 * 题解
 *  -1-  新建一个方法，判断两个字符串是否是符合要求的左右括号
 *  -2-  利用栈的 先进后出的特点，每次判断栈顶和第i个字符，如果是匹配的则出栈，否则进栈
 *  -3-  出栈有可能会产生越界出错的可能，所以栈的size为0时，要添加元素进栈
 *  -4-  最后判断stack的size是否为0
 */
public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (stack.size() == 0) {
                stack.push(s.charAt(i));
            } else if (isMatch(stack.peek(),s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        return stack.size() == 0;
    }

    public static boolean isMatch(char c1,char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[({[  ]})]}"));
    }
}

/** 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
