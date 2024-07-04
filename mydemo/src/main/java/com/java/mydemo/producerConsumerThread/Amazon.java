package com.java.mydemo.producerConsumerThread;

public class Amazon {
    int i;
    Boolean flag = false;

    synchronized void deliver(int i) throws InterruptedException {
        if(flag){
            wait();
        }
        this.i = i;
        System.out.println("Data Delivered " + i);
        flag= true;
    }

    synchronized int receive() throws InterruptedException {
        if(!flag){
            wait();
        }
        System.out.println("Data Received " + i);
        flag  = false;
        notify();
        return i;


    }

}
