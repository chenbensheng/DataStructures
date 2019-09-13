package com.leetcode;

/**
 * ����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣 ��������޻����򷵻� null��
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
        //������ ͷָ�����ָ�붼�����ƶ����������������s
        while(head!=slow.next){
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}
