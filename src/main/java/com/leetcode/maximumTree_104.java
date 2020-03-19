package com.leetcode;

public class maximumTree_104 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left= maxDepth(root.left);
            int right= maxDepth(root.right);

            if(left<right){
             return  right+1;
            }
            return left+1;

        }
    }
}
