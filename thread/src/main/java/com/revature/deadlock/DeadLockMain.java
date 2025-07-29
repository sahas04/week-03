package com.revature.deadlock;

public class DeadLockMain {
    public static void main(String[] args) {
        String resource1="Resource1";
        String resource2="Resource2";

        DeadLock deadLock1=new DeadLock(resource1,resource2);
        Thread t1=new Thread(deadLock1,"thread1");

        DeadLock deadLock2=new DeadLock(resource2,resource1);
        Thread t2=new Thread(deadLock2,"thread2");

        t1.start();
        t2.start();
    }
}
