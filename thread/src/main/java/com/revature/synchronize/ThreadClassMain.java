package com.revature.synchronize;

public class ThreadClassMain {
    public static void main(String[] args) {
        ThreadClass threadClass=new ThreadClass();
        Thread thread=new Thread(threadClass,"thread1");
        Thread thread1=new Thread(threadClass,"thread2");
        thread.start();
        thread1.start();
    }
}
