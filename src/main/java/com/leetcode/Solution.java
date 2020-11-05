package com.leetcode;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/6/25 16:31
 */
public class Solution {

    public static void main(String[] args) {
        isUnique("abcda");
    }

    public static boolean isUnique(String astr) {
        int [] nums= new int[128];
        for (int i = 0; i < astr.length() ; i++) {
            char item = astr.charAt(i);
            int result= item -97;
            nums[result]++;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>=2){
                return  false;
            }
        }
        return true;
    }

}
