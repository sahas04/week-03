package com.revature.deadlock;

public class DeadLock extends Thread{
    private final String lock1;
    private final String lock2;

    public DeadLock(String lock1, String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1){
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"locked"+lock1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("interupt");
                }
                System.out.println(Thread.currentThread().getName()+"trying to lock"+lock2);
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName()+"locked"+lock2);
                }
            }
        }
    }
}
