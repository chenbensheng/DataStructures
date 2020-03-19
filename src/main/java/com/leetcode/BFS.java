package com.leetcode;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    public void levelOrder(TreeNode node){

        Queue<TreeNode> deque=new ArrayDeque<>();
        deque.add(node);
        while (!deque.isEmpty()){
            TreeNode treeNode=deque.remove();
            System.out.println(treeNode.val+"   ");
            if(treeNode.left!=null){
                deque.add(treeNode.left);
            }
            if(treeNode.right!=null){
                deque.add(treeNode.right);
            }
        }
    }
    //前序遍历--根 左  右
    public void depthTraversal(TreeNode root){
        if(root==null){
            System.out.print("empty tree");
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode=root;
        while(treeNode!=null||!stack.isEmpty()){

            while(treeNode!=null){
                System.out.println(treeNode.val);
                stack.push(treeNode);
                treeNode=treeNode.left;
            }
            if(!stack.isEmpty()){
                treeNode=stack.pop();
                treeNode=treeNode.right;
            }
        }
    }
}
