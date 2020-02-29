package com.leetcode;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {2,0,3,2,4};

        System.out.println(findRepeatNumber(nums));


    }

    public static  int findRepeatNumber(int[] nums) {

        int temp =nums[0];
        for (int i = 1; i < nums.length; i++) {

            temp ^= nums[i];
        }
        return temp;
    }
}
