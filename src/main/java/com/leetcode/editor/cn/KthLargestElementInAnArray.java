//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 示例 1: 
//
// 输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 说明: 
//
// 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。 
// Related Topics 堆 分治算法 
// 👍 763 👎 0

package com.leetcode.editor.cn;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray{
   public static void main(String[] args) {
         Solution solution = new KthLargestElementInAnArray().new Solution();
         int[] nums ={3,2,1,5,6,4};
       System.out.println(solution.findKthLargest(nums, 2));


   }
    //
class Solution {
    /**
     *  在未排序的数组中找到第 k 个最大的元素。
     * 时间复杂度 O(NlogK)，空间复杂度 O(K)
     */
    public int findKthLargest(int[] nums, int k) {
        //PriorityQueue通过二叉小顶堆实现 保证每次取出都是最小值
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val: nums) {
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}