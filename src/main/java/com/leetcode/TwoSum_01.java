package com.leetcode;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class TwoSum_01 {
    public static void main(String[] args) {
        TwoSum_01 twoSum_01=new TwoSum_01();
        int[] nums={6, 2, 4};
        System.out.println(JSONObject.toJSONString(twoSum_01.twoSum(nums,12 )));
    }
    /*
    public int[] twoSum(int[] nums,int target){

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }*/

   /* public int[] twoSum(int[] nums,int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (map.containsKey(complement) && map.get(complement) != j) {
                return new int[]{j, map.get(complement)};
            }
        }
        return null;
    }*/

    public int[] twoSum(int[] nums,int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])!=null){
               return new int[] {map.get(nums[i]),i};
            }
            map.put(target-nums[i], i);
        }
        return null;
    }
}
