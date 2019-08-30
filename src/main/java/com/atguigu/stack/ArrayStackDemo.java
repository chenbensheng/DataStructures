package com.atguigu.stack;

import java.util.Scanner;

public class ArrayStackDemo {

	public static void main(String[] args) {
		//����һ��ArrayStack �Ƿ���ȷ
		//�ȴ���һ��ArrayStack����->��ʾջ
		ArrayStack stack = new ArrayStack(4);
		String key = "";
		boolean loop = true; //�����Ƿ��˳��˵�
		Scanner scanner = new Scanner(System.in);
		
		while(loop) {
			System.out.println("show: ��ʾ��ʾջ");
			System.out.println("exit: �˳�����");
			System.out.println("push: ��ʾ������ݵ�ջ(��ջ)");
			System.out.println("pop: ��ʾ��ջȡ������(��ջ)");
			System.out.println("���������ѡ��");
			key = scanner.next();
			if ("show".equals(key)) {
				stack.list();
			} else if ("push".equals(key)) {
				System.out.println("������һ����");
				int value = scanner.nextInt();
				stack.push(value);
			} else if ("pop".equals(key)) {
				try {
					int res = stack.pop();
					System.out.printf("��ջ�������� %d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			} else if ("exit".equals(key)) {
				scanner.close();
				loop = false;
			}
		}
		
		System.out.println("�����˳�~~~");
	}

}

//����һ�� ArrayStack ��ʾջ
class ArrayStack {
	private int maxSize; // ջ�Ĵ�С
	private int[] stack; // ���飬����ģ��ջ�����ݾͷ��ڸ�����
	private int top = -1;// top��ʾջ������ʼ��Ϊ-1
	
	//������
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[this.maxSize];
	}
	
	//ջ��
	public boolean isFull() {
		return top == maxSize - 1;
	}
	//ջ��
	public boolean isEmpty() {
		return top == -1;
	}
	//��ջ-push
	public void push(int value) {
		//���ж�ջ�Ƿ���
		if(isFull()) {
			System.out.println("ջ��");
			return;
		}
		top++;
		stack[top] = value;
	}
	//��ջ-pop, ��ջ�������ݷ���
	public int pop() {
		//���ж�ջ�Ƿ��
		if(isEmpty()) {
			//�׳��쳣
			throw new RuntimeException("ջ�գ�û������~");
		}
		int value = stack[top];
		top--;
		return value;
	}
	//��ʾջ�����[����ջ]�� ����ʱ����Ҫ��ջ����ʼ��ʾ����
	public void list() {
		if(isEmpty()) {
			System.out.println("ջ�գ�û������~~");
			return;
		}
		//��Ҫ��ջ����ʼ��ʾ����
		for(int i = top; i >= 0 ; i--) {
			System.out.printf("stack[%d]=%d\n", i, stack[i]);
		}
	}
	
}
