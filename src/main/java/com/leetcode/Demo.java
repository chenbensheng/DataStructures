package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        int[] nums={0,1,3,3,3,3,3,7,8};

        System.out.println(majorityElement2(nums));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int height=matrix.length;
        int width = matrix[0].length;

        int x=0;
        int y=width-1;
        while(height>x && y>0){

        }
        return true;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int midNum = nums.length >> 1;
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
    public static int majorityElement2(int[] nums) {
        int count=1;
        int res=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(res==nums[i]){
                count++;
            }else {
                count--;

                if(count==0){
                    res=nums[i+1];
                }
            }
        }
        return res;
    }
}
