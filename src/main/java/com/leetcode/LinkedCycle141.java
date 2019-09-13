package com.leetcode;

/**
 * 为了表示给定链表中的环，
 * 我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 快指针每次走两步，慢指针一次走一步。
 * 在慢指针进入环之后，快慢指针之间的距离每次缩小1，所以最终能相遇。
 */
public class LinkedCycle141 {

    public boolean hasCycle(ListNode head) {
        if(head ==null||head.next==null){
            return false;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while (fast!=slow){
            if(fast==null||fast.next==null){
                return false ;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}
