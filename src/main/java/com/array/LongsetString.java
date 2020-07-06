package com.array;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/2 14:19
 * 最长公共前缀
 */
public class LongsetString {

    public static void main(String[] args) {
        String[] strs={"abb","ab"};
        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        //默认第一个字符串 是最长公共前缀
        for (int i = 0; i <strs[0].length() ; i++) {
            char c= strs[0].charAt(i);
            for (int j = 1; j <strs.length ; j++) {

                if(i==strs[j].length()|| c!=strs[j].charAt(i) ){
                    return strs[0].substring(0,i);
                }
            }
        }
        
        return strs[0];
    }
}
