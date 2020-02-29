package com.leetcode;

/**
 * 反转链表
 */
public class Reverselinked_206 {

    /**
     * 我们可以申请两个指针，第一个指针叫 pre，最初是指向 null 的。
     * 第二个指针 cur 指向 head，然后不断遍历 cur。
     * 每次迭代到 cur，都将 cur 的 next 指向 pre，然后 pre 和 cur 前进一位。
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;

        }

        return  pre;
    }
}
