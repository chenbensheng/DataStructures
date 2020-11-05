package com.offer;

import com.leetcode.ListNode;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 从尾到头打印链表
 * @Author: chenbensheng
 * @CreateDate: 2020/10/10 16:40
 */
public class Test06 {

    public int[] reversePrint(ListNode head) {
        //1.计算链表的长度
        int length=0;
        ListNode curr= head;
        while(curr!=null){
          length++;
          curr=curr.next;
        }
        //初始化数组
        int[] result= new int[length];

        ListNode curr2= head;
        int  i= length-1;
        while (curr2!=null){
            result[i]=curr2.val;
            i--;
            curr2=curr2.next;
        }
        return result;
    }

    public int[] reversePrint2(ListNode head) {
        Stack<ListNode> stack =new Stack<ListNode>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;

        }
        //初始化数组
        int[] result= new int[stack.size()];
        for (int i = 0; i <stack.size() ; i++) {
            result[i] =stack.pop().val;
        }
        return result;
    }
}
