package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeNum_15 {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1,1,2,2, -1, -4};

        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){

            if (i == 0 || i > 0 && nums[i] != nums[i-1]){//nums[i] != nums[i-1] 去重
                int l = i+1, r = nums.length-1;
                while(l < r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0){
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--;//去重
                        l++;
                        r--;
                    }else if (sum > 0){
                        while(l < r && nums[r] == nums[r-1]) r--;//去重
                        r--;
                    }
                    else {
                        while(l < r && nums[l] == nums[l+1]) l++;//去重
                        l++;
                    }
                }
            }
        }

        System.out.println(res);
    }


}