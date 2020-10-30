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
 */
class Solution {
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
}
//leetcode submit region end(Prohibit modification and deletion)

}