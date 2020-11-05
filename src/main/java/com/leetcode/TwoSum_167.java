package com.leetcode;

/**
 * @Author: chenbensheng  有序数组
 * @CreateDate: 2020/7/5 23:57
 */
public class TwoSum_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while (i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }else if (sum>target){
                j--;
            }else {
                i++;
            }
        }
        return null;
    }

}
