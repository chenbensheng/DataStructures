package com.atguigu.linkedlist;

import java.util.Stack;

/**
 * Author:   chenbensheng
 * Date:     2019/6/11 17:27
 */
public class SingleLinkedListDemo2 {

    public static void main(String[] args) {
        Node node1=new Node(1, "�ν�1", "��ʱ��1");
        Node node3=new Node(3, "�ν�3", "��ʱ��3");
        Node node2=new Node(2, "�ν�2", "��ʱ��2");

        SingleLinkedList2 singleLinkedList2=new SingleLinkedList2();
        singleLinkedList2.add(node1);
        singleLinkedList2.add(node2);
        singleLinkedList2.add(node3);
        //singleLinkedList2.list();
        reversePrint(singleLinkedList2.getHead());
    }


    public static void reversePrint(Node head){
        if(head.next==null){
            return;
        }
        Stack<Node> stack=new Stack<Node>();
        Node cur=head.next;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

    }
}

class SingleLinkedList2 {
    private Node head = new Node(0, "", "");

    public Node getHead(){return head ;}

    public void add(Node node){
        Node temp=head;

        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next = node;
    }

    public void del(int no){

    }

    public void list(){
        if(head.next == null) {
            System.out.println("����Ϊ��");
            return;
        }
        Node temp=head.next;
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}

class Node {
    public int no;
    public String name;
    public String nickname;
    public Node next; //ָ����һ���ڵ�
    //������
    public Node(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
    @Override
    public String toString() {
        return "Node [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
    }

}