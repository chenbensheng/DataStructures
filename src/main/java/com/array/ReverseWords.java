package com.array;

import java.util.Stack;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/5 22:48
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 */
public class ReverseWords {

    public static void main(String[] args) {
        String s="a good      example";
        System.out.println(reverseWords2( s));
    }

    public static String reverseWords(String s) {
        //去掉头尾多余的空格
        s = s.trim();
        String[] arr = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverseWords2(String s) {
        //去掉头尾多余的空格
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        //逆序遍历
        for (int i = arr.length-1; i>=0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }

}
