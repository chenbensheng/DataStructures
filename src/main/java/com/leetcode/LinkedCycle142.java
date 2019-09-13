package com.leetcode;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 */
public class LinkedCycle142 {

    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while (fast!=slow){
            if(fast==null||fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        //相遇后 头指针和慢指针都单步移动，相遇即环的入口s
        while(head!=slow.next){
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}
