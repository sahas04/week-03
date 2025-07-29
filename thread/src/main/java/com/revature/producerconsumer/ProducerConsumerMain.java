package com.revature.producerconsumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        ProducerConsumer store = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                store.produce(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                store.consume();
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
