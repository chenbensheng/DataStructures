package com.leetcode;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/11/18 20:15
 */
public class Test {

    public static void main(String[] args) {
        char[] chars1={'a','b','c','d','e','f','g'};
        char[] chars2={'a','b','c','d','f','g'};

        System.out.println(find(chars1, chars2));
    }

    //
    public static char find(char[] chars1, char[] chars2) {
        int length1 = chars1.length;
        int length2 = chars2.length;
        int mix = Math.min(length1, length2);
        int index = 0;
        Character result = null;
        while (index < mix) {
            if (chars1[index] == chars2[index]) {
                index++;
            } else {
                break;
            }
        }
        if (length1 > length2) {
            result = chars1[index];
        } else {
            result = chars2[index];
        }
        return result;
    }
}


