package com.array;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/1 19:05
 */
public class Demo {


    public int searchInsert(int[] nums, int target) {
       if(nums.length==0){
           return 0;
       }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 反转字符串
     * 输入：["h","e","l","l","o"]
     * 输出：["o","l","l","e","h"]
     * @param s
     */
    public char[] reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while (i<=j){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        return s;
    }



}


