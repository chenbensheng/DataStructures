package com.offer;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @Author: chenbensheng
 * @CreateDate: 2020/10/10 16:06
 */
public class Test05 {

    public String replaceSpace(String s) {
        int n = s.length();
        char[] arry = new char[n * 3];
        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                arry[size++] ='%';
                arry[size++] ='2';
                arry[size++] ='0';

            } else {
                arry[size++] =c;
            }
        }
        String news= new String(arry,0,size);
        return news;
    }
}
