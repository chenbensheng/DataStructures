package com.leetcode;

/**
 * ��ת����
 */
public class Reverselinked_206 {

    /**
     * ���ǿ�����������ָ�룬��һ��ָ��� pre�������ָ�� null �ġ�
     * �ڶ���ָ�� cur ָ�� head��Ȼ�󲻶ϱ��� cur��
     * ÿ�ε����� cur������ cur �� next ָ�� pre��Ȼ�� pre �� cur ǰ��һλ��
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
