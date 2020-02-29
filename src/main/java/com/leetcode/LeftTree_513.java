package com.leetcode;

/**
 * DFS  广度优先遍历
 */
public class LeftTree_513 {

    private  int ans = -1;

    private  int max = -1;

    public int findBottomLeftValue(TreeNode root) {

        dfs(root,0);
        return ans;
    }

    private void dfs(TreeNode root,int h){
        if(root==null){
            return;
        }
        if(root.left==null && root.right == null){
            if(h>max){
                max =h;
                ans=root.val;
            }
        }
        dfs(root.left,h+1);
        dfs(root.right,h+1);
    }

}
