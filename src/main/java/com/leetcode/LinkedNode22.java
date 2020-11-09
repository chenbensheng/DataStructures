package com.leetcode;


/**
 */
public class LinkedNode22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1=head;
        ListNode p2=head;

        for (int i = 0; i < k ; i++) {
            p1=p1.next;
        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
