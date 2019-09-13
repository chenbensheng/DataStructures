package com.leetcode;

/**
 * Ϊ�˱�ʾ���������еĻ���
 * ����ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� ��� pos �� -1�����ڸ�������û�л���
 * ��ָ��ÿ������������ָ��һ����һ����
 * ����ָ����뻷֮�󣬿���ָ��֮��ľ���ÿ����С1������������������
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
