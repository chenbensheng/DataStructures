package com.leetcode;

/**
 * ��ת����
 */
public class Reverselinked_206 {


    public static void main(String[] args) {
        Reverselinked_206 rever=new Reverselinked_206();
        Reverselinked_206.ListNode p1 = rever.new ListNode(1);
        Reverselinked_206.ListNode p2 = rever.new ListNode(2);
        Reverselinked_206.ListNode p3 = rever.new ListNode(3);
        p1.next=p2;
        p2.next=p3;
        p3.next=null;
        System.out.println(reverseList(p1).val);

    }

    /**
     * ���ǿ�����������ָ�룬��һ��ָ��� pre�������ָ�� null �ġ�
     * �ڶ���ָ�� cur ָ�� head��Ȼ�󲻶ϱ��� cur��
     * ÿ�ε����� cur������ cur �� next ָ�� pre��Ȼ�� pre �� cur ǰ��һλ��
     */
    public static ListNode reverseList(ListNode head) {

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
    class  ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

}


