package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_169 {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int aa = nums[i];
            if (hashMap.containsKey(aa)) {
                hashMap.put(aa, hashMap.get(aa) + 1);
            } else {
                hashMap.put(aa, 1);
            }
        }
         Map.Entry<Integer,Integer> count= null ;
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if(count==null||entry.getValue()>count.getValue()){
                count=entry;
            }
        }
       return  count.getKey();
    }

    public int majorityElement2(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int midNum = nums.length / 2;
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            int n=nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int num :nums) {
            if(map.get(num)>midNum){
                res=num;
            }
        }
        return res;
    }

}
