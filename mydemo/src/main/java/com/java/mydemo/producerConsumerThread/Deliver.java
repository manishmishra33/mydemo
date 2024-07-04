package com.java.mydemo.producerConsumerThread;

public class Deliver extends Thread{
    Amazon amazon;
    Deliver(Amazon amazon){
        this.amazon =amazon;
    }

    @Override
    public void run() {
        for(int j =1;j<=10;j++){
            try {
                amazon.deliver(j);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
