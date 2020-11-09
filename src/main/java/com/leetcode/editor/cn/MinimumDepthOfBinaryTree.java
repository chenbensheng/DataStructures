//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 387 👎 0

package com.leetcode.editor.cn;

import com.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinimumDepthOfBinaryTree{
   public static void main(String[] args) {
         Solution solution = new MinimumDepthOfBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 *
 */
class Solution {

    //广度优先遍历
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.add(root);
        int dept=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                if(node.left==null&&node.right==null){
                    return dept;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            dept++;

        }
        return dept;
    }
    // 深度优先遍历 DFS
    public int minDepth2(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return 1;
        }
        int ans=Integer.MAX_VALUE;
        if(root.left!=null){
            int left = minDepth2(root.left);
            ans=Math.min(left,ans);
        }
        if(root.right!=null){
            int right = minDepth2(root.right);
            ans=Math.min(right,ans);
        }
        //每次要累加+1
        return ans+1;
    }

    public int minDepth3(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth3(root.left);
        int right = minDepth3(root.right);
        if (left == 0 || right == 0) return left + right + 1;
        return Math.min(left, right) + 1;
    }

    }

}