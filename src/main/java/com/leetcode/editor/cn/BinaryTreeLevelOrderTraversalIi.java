//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 354 👎 0

package com.leetcode.editor.cn;

import com.leetcode.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalIi{
   public static void main(String[] args) {
         Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            //每次遍历的层级长度
            int size = queue.size();
            List<Integer> alist =new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                alist.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(alist);
        }
        Collections.reverse(res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}