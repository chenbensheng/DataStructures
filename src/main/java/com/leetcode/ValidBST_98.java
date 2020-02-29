package com.leetcode;

/**
 * ��֤�Ƿ�Ϊ���������
 */
public class ValidBST_98 {

    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }

    public boolean isValid(TreeNode root,Integer min,Integer max) {
        if(root==null){
            return true;
        }
        if (min!= null && root.val<=min) return false;
        if (max!= null && root.val>=max) return false;

        return isValid(root.left,min,root.val)&& isValid(root.right,root.val,max);
    }
}