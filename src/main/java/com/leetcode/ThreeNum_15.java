package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeNum_15 {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, 1, 2, 2, -1, -4};
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null||nums.length<=2){
            return ;
        }
       // O(nlogn)
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1 ; i++) {
            int left=i+1;
            int right = nums.length-1;
            int target = -nums[i];
            int sum =nums[left]+nums[right];
            if(nums[i]==nums[i+1]){
                continue;
            }
            while(left<right){
                if(sum==target){
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[left]);
                    ll.add(nums[right]);
                    res.add(ll);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left--]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right++]){
                        right--;
                    }
                }else if (sum< target){
                    left++;
                }else {
                    right--;
                }
            }

        }
        System.out.println(res);
    }


}