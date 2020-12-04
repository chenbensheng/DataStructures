package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/12/2 19:19
 */
public class ThreeSum {
    //给定{1,5,98,23,54,12,43,…..} 序列, 找出三个数和等于N=123的组合 
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums,int findVal){
        List<List<Integer>> ans= new ArrayList<>();
        if(nums.length<3){
            return ans;
        }
        Arrays.sort(nums);
        int len=nums.length;
        for (int i = 0; i < len ; i++) {
            int L=i+1;
            int R=len-1;
            while(L<R){
                int sum=nums[i]+nums[L]+nums[R];
                if(sum==findVal){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while(L<R){

                    }
                }
            }
        }
        return null;

    }
}
