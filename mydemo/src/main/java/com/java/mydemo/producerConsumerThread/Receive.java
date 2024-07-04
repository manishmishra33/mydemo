package com.java.mydemo.producerConsumerThread;

public class Receive extends  Thread{

    Amazon amazon;

    Receive(Amazon amazon){
        this.amazon = amazon;
    }

    @Override
    public void run() {
        for(int k=1;k<=10;k++){
            try {
                amazon.receive();
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
