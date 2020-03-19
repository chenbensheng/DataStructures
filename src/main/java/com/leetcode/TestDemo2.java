package com.leetcode;


/**
 * 输入：- 1->8->3->4->0 
 *  输出：-1->0->3->4->8
 */
public class TestDemo2 {

    public static void main(String[] args) {

    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode h = new ListNode(0);
        ListNode rest = h;

        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return rest.next;
    }


}
