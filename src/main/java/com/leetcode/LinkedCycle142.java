package com.leetcode;

/**
 * ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
 * slow指针 位置不变 ，将fast指针重新 指向链表头部节点 ；slow和fast同时每轮向前走  步；
 */
public class LinkedCycle142 {

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

        while (head != slow.next) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
