package com.revature.livelock;

public class FriendMain {
    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");

        Thread t1 = new Thread(() -> a.bow(b), "Thread-A");
        Thread t2 = new Thread(() -> b.bow(a), "Thread-B");

        t1.start();
        t2.start();
    }
}
