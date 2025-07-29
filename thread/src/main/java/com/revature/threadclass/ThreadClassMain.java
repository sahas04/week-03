package com.revature.threadclass;

public class ThreadClassMain {
    public static void main(String[] args) {
        ThreadClass threadClass=new ThreadClass();
        Thread thread=new Thread(threadClass);
        thread.start();
    }
}
