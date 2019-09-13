package com.leetcode;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * ���� nums = [2, 7, 11, 15], target = 9
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
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
