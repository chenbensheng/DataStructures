package com.leetcode;

/**
 * ��������
 * �ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ�������������
 * ̰���㷨
 * ʱ�临�Ӷȣ�\mathcal{O}(N)O(N)��ֻ����һ�����顣
 * �ռ临�Ӷȣ�\mathcal{O}(1)O(1)��ֻʹ���˳����ռ�
 */
public class MaxSubarray_53 {
    public static void main(String[] args) {
        int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {

        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
          if(curSum<0){
             curSum=nums[i];
          }else{
              curSum+=nums[i];
          }

          if(curSum>maxSum){
              maxSum=curSum;
          }
        }
        return maxSum;
    }
}
