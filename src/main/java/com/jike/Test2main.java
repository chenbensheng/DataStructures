package com.jike;

public class Test2main {

    public static void main(String[] args) {
        Thread thread= new Thread(){

            public void run(){
                System.out.println("ceshi----"+Thread.currentThread().getName());
            }
        };
        thread.run(); //主线程执行     ceshi----main
        thread.start();//新创建线程执行 ceshi----Thread-0

    }
}
