package com.array;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/5 23:23
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 */
public class SolutionStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static  int strStr(String haystack, String needle) {
        int L=needle.length();
        int n=haystack.length();
        //条件i+L<n-1
        for (int i = 0; i < n-L+1; i++) {
            if(haystack.substring(i,i+L).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
