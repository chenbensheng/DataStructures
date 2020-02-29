package com.jike;

public class Test1main {

    public static void main(String[] args) {
        runnable runner = new runnable();
        Thread th1 = new Thread(runner, "���߳�");

        //���������������
        System.out.println("th1.start():");
        th1.start();
        //1
        System.out.println("th1.run():");
        th1.run();
        //2
        System.out.println("runner.run():");
        runner.run();
        //3


    }

    public static class runnable implements Runnable {
        private int food = 10;

        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("�߳�����" + Thread.currentThread().getName() + " food:" + food--);
            }
        }
    }

}
