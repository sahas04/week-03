package com.revature.producerconsumer;

class ProducerConsumer {
    private int item;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        item = value;
        System.out.println("Produced: " + item);
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}



