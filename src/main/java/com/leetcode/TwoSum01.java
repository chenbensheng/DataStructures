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
        int[] nums={2, 7,2,7, 11, 15};
        System.out.println(JSONObject.toJSONString(twoSum_01.twoSum(nums,9 )));
    }


    public int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> map=new HashMap();
        int[] res=new int[2];

        for (int i = 0; i <nums.length ; i++) {

            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                break;

            }else{
                map.put(nums[i],i);
            }

        }
        return res;
    }
}
