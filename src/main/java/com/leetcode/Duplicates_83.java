package com.leetcode;

/**
 * ɾ�����������е��ظ�Ԫ��
 */
public class Duplicates_83 {

    public ListNode deleteDuplicates(ListNode head) {
       ListNode prev=head.next;
       ListNode end= head;

       while (prev!=null){
           if(end.val==prev.val){
               end.next=prev.next;
               prev=end.next;
           }else{
               prev=prev.next;
               end=end.next;
           }

       }

       return   head;
    }


}
