//给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//给定如下二叉树，以及目标和 sum = 22， 
//
//               5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
// 
//
// 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。 
// Related Topics 树 深度优先搜索 
// 👍 458 👎 0

package com.leetcode.editor.cn;

import com.leetcode.TreeNode;

public class PathSum{
   public static void main(String[] args) {
         Solution solution = new PathSum().new Solution();
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

    //DFS
    public boolean hasPathSum1(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null||root.right==null){
            return sum==root.val;
        }
        return hasPathSum1(root.left,sum-root.val)|| hasPathSum1(root.right,sum-root.val);
    }

    /**
     * 时间复杂度：O(N)O(N)，其中 NN 是树的节点数。对每个节点访问一次。
     * 空间复杂度：O(H)O(H)，其中 HH 是树的高度
     */
    public boolean hasPathSum2(TreeNode root, int sum) {
        return helper(root,0,sum);
    }

    public boolean helper(TreeNode root,int cur, int sum){
        if(root==null){
            return false;
        }
        cur=cur+root.val;
        if(root.left==null&&root.right==null){
            return cur==sum;
        }
       return helper(root.left,cur,sum)||helper(root.right,cur,sum);
    }

    public boolean hasPathSum3(TreeNode root, int sum) {
        return false;
    }



   }

}