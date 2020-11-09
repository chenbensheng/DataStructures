//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9487 👎 0

package com.leetcode.editor.cn;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class TwoSum{
   public static void main(String[] args) {
         Solution solution = new TwoSum().new Solution();
         int[] nums=new int[]{3,2,4};
         System.out.println(JSON.toJSONString(solution.twoSum(nums, 6)));
   }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //时间复杂度 O(0)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                int var1=map.get(target-nums[i]);
                res[0] =var1;
                res[1]=i;
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }

    /**
     *  双指针  前提必须是有序
     * @param nums
     * @param target
     * @return
     */
   public int[] twoSum2(int[] nums, int target) {
       if(nums.length<=0){
           return null;
       }
       //排序
       Arrays.sort(nums);
       int i=0;
       int j = nums.length-1;
       while(i<=j){
           int sum=nums[i]+nums[j];
           if(sum==target){
               return new int[]{i,j};
           }else if (sum < target ){
               i++;
           }else {
               j--;
           }
       }
       return null;
   }

    /**
    * 满足两数之和的全部记录下来  并输出
    */
   public List<int[]> twoSum3(int[] nums, int target) {
       int i =0;
       int j=nums.length-1;
       List<int[]> res = new ArrayList<>();
       while(i<=j){
           int sum = nums[i]+nums[j];
           int left=nums[i];
           int right=nums[j];
           if(sum < target){
               i++;
           }else if(sum > target){
                j--;
           }else {
               int[] member= new int[]{i,j};
               res.add(member);
               while(i<j&&nums[i]==left){
                   i++;
               }
               while(i<j&&nums[j]==right){
                   j--;
               }
           }
       }
       return res;
   }

   }
//leetcode submit region end(Prohibit modification and deletion)

}