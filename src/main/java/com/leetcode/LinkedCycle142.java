package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 */
public class LinkedCycle142 {
    //哈希表 时间复杂度 O(N)  空间复杂度 O(N)
    public ListNode detectCycle1(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visted = new HashSet<>();
        while (pos!=null){
           if(visted.contains(pos)){
               return pos;
           }
           visted.add(pos);
           pos=pos.next;
        }
        return null;
    }


    //时间复杂度 O(N)  空间复杂度 O(1)
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        //头结点，相遇点 各出发一个指针 相遇点就是入环点
        while (head != slow.next) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
