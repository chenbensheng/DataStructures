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

    public void depthTraversal(TreeNode node){
        if(node==null){
            System.out.print("empty tree");
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode rnode = stack.pop();
            System.out.print(rnode.val);
            if(rnode.right!=null){
                stack.push(rnode.right);
            }
            if(rnode.left!=null){
                stack.push(rnode.left);
            }
        }
    }
}
