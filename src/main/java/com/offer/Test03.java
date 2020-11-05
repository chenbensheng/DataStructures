package com.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/jian-zhi-offer-mian-shi-ti-jing-xuan-tu-jie-03-shu/
 * @Author: chenbensheng
 * @CreateDate: 2020/10/10 15:07
 */
public class Test03 {

    public static void main(String[] args) {
       /*int aa= findRepeatNumber2(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(aa);
        */
    }


    public static  int findRepeatNumber(int[] nums) {
        Set set = new HashSet<Integer>();
        int result=-1;
        for (int num : nums) {
            if(!set.add(num)){
                result=num;
                break;
            }
        }
        return result;
    }


    /**
     * 遍历数组需要 O(N) 在源数组上做修改
     *  利用数组下标---保证下标==元素值
     */
    public  int findRepeatNumber2(int[] nums) {
        int result=-1;
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
           while(nums[i]!=i && nums[nums[i]]!=nums[i]){
               swap(nums,i,nums[i]);
           }
           if(nums[i]!=i && nums[nums[i]]==nums[i]){
               return nums[i];
           }
        }
        return result;
    }

    public void swap (int[] nums , int i, int j ){
       int tmp= nums[i];
       nums[i]=nums[j];
       nums[j]=tmp;
    }
}
