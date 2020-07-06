package com.leetcode;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivoIndex(nums));


    }
    //中心索引
    public static int pivoIndex(int[] nums){
        int sum =0,sumLeft=0,sumRight=0;
        for(int n: nums){
            sum+=n;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(i==0){
                sumLeft=0;
            }else{
                sumLeft=sumLeft+nums[i-1];
            }
            sumRight = sum-sumLeft-nums[i];
            if(sumLeft==sumRight){
               return i;
            }
        }
        return -1;
    }

    public static  int findRepeatNumber(int[] nums) {

        int temp =nums[0];
        for (int i = 1; i < nums.length; i++) {

            temp ^= nums[i];
        }
        return temp;
    }
}
