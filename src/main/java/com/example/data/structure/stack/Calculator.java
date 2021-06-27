package com.example.data.structure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    public static int getPriority(char c) {
        if (c == '*' || c == '/') return 1;
        return 0;
    }

    public static int calculate(int n1, int n2, char c) {
        if (c == '+') return n2 + n1;
        if (c == '-') return n2 - n1;
        if (c == '/' && n1 != 0) return n2 / n1;
        return n2 * n1;
    }

    public static int calculate(String str) {
        Stack<Character> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (!isNum(c)) {

                if (!charStack.empty() && getPriority(charStack.peek()) >= getPriority(c)) {
                    int n1 = numStack.pop() - '0';
                    int n2 = numStack.pop() - '0';
                    char ch = charStack.pop();
                    int result = calculate(n1, n2, ch);

                    numStack.push((char) (result + '0'));
                    charStack.push(c);

                } else {
                    charStack.push(c);
                }

            } else {
                numStack.push(c);
            }

        }

        while (!charStack.empty()) {
            int n1 = numStack.pop() - '0';
            int n2 = numStack.pop() - '0';
            char ch = charStack.pop();
            int result = calculate(n1, n2, ch);

            numStack.push((char) (result + '0'));
        }

        return numStack.pop() - '0';
    }

    public static int getPriority(String str) {
        if ("*".equals(str) || "/".equals(str)) return 1;
        else if ("(".equals(str) || ")".equals(str)) return -1;
        return 0;
    }

    public static int calculate(int n1,int n2,String s) {
        if ("+".equals(s)) return n2 + n1;
        else if ("-".equals(s)) return n2 - n1;
        else if ("/".equals(s) && n1 != 0) return n2 / n1;
        return n2 * n1;
    }

    public static List<String> toInfixExpression(String str) {
        int i = 0;
        String num;
        List<String> list = new ArrayList<>();
        while (i < str.length()) {
            char c = str.charAt(i);
            if (isNum(c)) {
                num = "";
                while (i < str.length() && isNum(c)) {
                    num += c;
                    i ++;
                    if (i < str.length()) c = str.charAt(i);
                }
                list.add(num);
            } else {
                list.add(String.valueOf(c));
                i ++;
            }

        }
        return list;
    }

    public static List<String> toSuffixExpression(List<String> list) {
        //首先定义两个栈，一个栈用来存放  符号
        Stack<String> charStack = new Stack<>(); //符号栈
        //另一个栈 数字和符号都要存，因为该栈没有 pop 操作，并且后面要逆序输出，所以用list代替
        List<String> resList = new ArrayList<>();

        for (String i : list) {
            if (i.matches("\\d+")) {
                resList.add(i);//若遇到数字，则直接放到list中
            } else if (i.equals("(")) {
                charStack.push(i);//遇到 ( ，则 push 到符号栈中
            } else if (i.equals(")")) {
                // 匹配到 ) ，则要一直循环弹出 符号栈中的运算符，并把弹出的运算符添加到list中，直到遇到 ( 为止
                while (!charStack.peek().equals("(")) {
                    resList.add(charStack.pop());
                }
                //最后，将 左括号消除
                charStack.pop();
            } else {
                //当 i 的优先级小于 符号栈栈顶的优先级时，pop出该元素并添加到list中，然后再次于符号栈栈顶比较优先级
                while (charStack.size() > 0 && getPriority(charStack.peek()) >= getPriority(i)) {
                    resList.add(charStack.pop());
                }
                //最后，还需要将当前扫描到的符号push到符号栈中
                charStack.push(i);
            }
        }

        /*list.forEach(i -> {
            if (i.matches("\\d+")) {
                resList.add(i);//若遇到数字，则直接放到list中
            } else if (i.equals("(")) {
                charStack.push(i);//遇到 ( ，则 push 到符号栈中
            } else if (i.equals(")")) {
                // 匹配到 ) ，则要一直循环弹出 符号栈中的运算符，并把弹出的运算符添加到list中，直到遇到 ( 为止
                while (!charStack.peek().equals("(")) {
                    resList.add(charStack.pop());
                }
                //最后，将 左括号消除
                charStack.pop();
            } else {
                //当 i 的优先级小于 符号栈栈顶的优先级时，pop出该元素并添加到list中，然后再次于符号栈栈顶比较优先级
                while (charStack.size() > 0 && getPriority(charStack.peek()) >= getPriority(i)) {
                    resList.add(charStack.pop());
                }
                //最后，还需要将当前扫描到的符号push到符号栈中
                charStack.push(i);
            }
        });*/

        //若符号栈中还有符号，则需将符号栈中的元素添加到list中
        while (!charStack.empty()) resList.add(charStack.pop());

        return resList;
    }

    public static int calculate(List<String> list) {
        Stack<String> stack = new Stack<>();
        list.forEach(i -> {
            if (i.matches("\\d+")) {
                stack.push(i);
            } else {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                int res = calculate(n1,n2,i);
                stack.push("" + res);
            }
        });

        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        /*System.out.println(calculate("7+2*5-9/3"));*/
        toInfixExpression("(1+3)-2*6+17/5").forEach(i -> System.out.print(i + "  "));
        System.out.println();

        List<String> list = toSuffixExpression(toInfixExpression("7+2*5-9/3"));
        System.out.println(list);
        System.out.println(calculate(list));


    }

}
