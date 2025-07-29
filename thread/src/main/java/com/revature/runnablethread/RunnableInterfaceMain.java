package com.revature.runnablethread;

public class RunnableInterfaceMain {
    public static void main(String[] args) {
        RunnableInterface runnableInterface=new RunnableInterface();
        Thread thread=new Thread(runnableInterface,"t1");
        thread.start();
    }
}
