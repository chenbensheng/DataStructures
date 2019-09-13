package com.leetcode;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum01 {
    public static void main(String[] args) {
        TwoSum01 twoSum_01=new TwoSum01();
        int[] nums={2, 7, 11, 15};
        System.out.println(JSONObject.toJSONString(twoSum_01.twoSum(nums,9 )));
    }


    public int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> map=new HashMap();
        int length=nums.length;
        for (int i = 0; i <length ; i++) {

            if(map.get(nums[i])!=null){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);

        }
        return null;
    }
}
