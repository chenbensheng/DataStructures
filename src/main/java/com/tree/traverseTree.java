package com.tree;

import com.alibaba.fastjson.JSON;
import com.leetcode.TreeNode;

import java.util.*;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/7/7 19:40
 * 二叉树的前序遍历  DFS  深度优先遍历
 *
 */
public class traverseTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode level2_1 = new TreeNode(3);
        TreeNode level2_2 = new TreeNode(4);
        TreeNode level3_1 = new TreeNode(7);
        TreeNode level3_2 = new TreeNode(8);
        TreeNode level3_3 = new TreeNode(2);
        TreeNode level3_4 = new TreeNode(11);
        TreeNode level4_1 = new TreeNode(10);
        TreeNode level4_2 = new TreeNode(12);
        root.left=level2_1;
        root.right=level2_2;
        level2_1.left=level3_1;
        level2_1.right=level3_2;
        level2_2.left=level3_3;
        level2_2.right=level3_4;
        level3_1.left=level4_1;
        level3_1.right=level4_2;
        List<List<Integer>> res = levelOrder(root);
        System.out.println(JSON.toJSONString(res));
    }

    /**
     * 二叉树的前序遍历  DFS  深度优先遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(null==root){
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return output;
    }

    /**
     * 二叉树的中序遍历  DFS
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        helper(root,output);
        return  output;
    }

    public void helper(TreeNode root,LinkedList<Integer> output){
        if(root.left!=null){
            helper(root.left,output);
        }
        if(root.right!=null){
            helper(root.right,output);
        }
    }

    /**
     * 二叉树的中序遍历  DFS
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack =new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        TreeNode curr=root;
        while (curr!=null||!stack.isEmpty()){
           while(curr!=null){
             stack.push(curr);
             curr=curr.left;
           }
           curr= stack.pop();
           output.add(curr.val);
           curr=curr.right;
        }

        return  output;
    }
    /**
     * 二叉树的后序遍历  DFS 左右根
     * @param root 2个栈解决
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root==null) return res;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()) {
            TreeNode tempNode = st1.pop();
            st2.push(tempNode);
            if(tempNode.left!=null) {
                st1.push(tempNode.left);
            }
            if(tempNode.right!=null) {
                st1.push(tempNode.right);
            }
        }
        while(!st2.isEmpty()) {
            res.add(st2.pop().val);
        }
        return res;
    }


    /**
     * 二叉树的层序遍历
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();//root不为空时，此时第一层的节点数是n=1；
            List<Integer> list = new ArrayList<>();
            /*再进行n次循环，确保当前层的节点全部出队列，
              并把所有当前层节点的左右孩子加入队列，
              保证队列的size就是下一层的节点数。
            */
            for(int i = 0;i < n;i++){
                root = queue.poll();
                list.add(root.val);
                if(root.left != null)
                    queue.add(root.left);
                if(root.right != null)
                    queue.add(root.right);
            }
            res.add(list);
        }
        return res;
    }

}
