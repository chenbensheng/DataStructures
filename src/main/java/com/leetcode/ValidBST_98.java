package com.leetcode;

/**
 * 验证是否为二叉查找树
 */
public class ValidBST_98 {

    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }

    public boolean isValid(TreeNode node,Integer min,Integer max) {
        if (node == null) {
            return true;
        }
        //父节点
        int val = node.val;
        if(min!=null && val<=min){
            return false;
        }
        if(max!=null && val>=max){
            return false;
        }
        if(!isValid(node.right,val,max)){
            return false;
        }
        if(!isValid(node.left,min,val)){
            return false;
        }
        return true;
    }
}
