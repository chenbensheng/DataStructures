package com.test;


import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeDuplicates( nums,3);

    }

    public static  int removeDuplicates(int[] nums,int val) {

       int back=0;
        for (int front = 0 ; front < nums.length; front++) {
            if (nums[front]!= val){
                nums[back]=nums[front];
                back++;

            }
        }
        for (int i = 0; i <back ; i++) {
            System.out.println(nums[i]);
        }
        return back;
    }
}
