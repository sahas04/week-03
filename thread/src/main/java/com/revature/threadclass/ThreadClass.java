package com.revature.threadclass;

public class ThreadClass extends Thread {
    @Override
    public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread" + " " + i + " is running");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

