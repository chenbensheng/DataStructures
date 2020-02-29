package com.jike;

public class Test2main {

    public static void main(String[] args) {
        Thread thread = new Thread() {

            public void run() {
                System.out.println("ceshi----" + Thread.currentThread().getName());
            }
        };
        thread.run(); //���߳�ִ��     ceshi----main
        thread.start();//�´����߳�ִ�� ceshi----Thread-0

    }
}
