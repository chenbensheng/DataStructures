package com.leetcode;

/**
 * 去除字符串中相邻重复的字符。
 */
public class RemoveRepeatChar {

    public static void main(String[] args) {
        String str="aabbbccccdddddeeeeeeeeefff234tttdddfffbbbggg";
        System.out.println(removeChar(str));

    }

    public static String removeChar(String s){


        int i=0;
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        while(i<len){
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while(i<len && s.charAt(i)==c){
                i++;
            }
        }
        return  sb.toString();
    }

}
