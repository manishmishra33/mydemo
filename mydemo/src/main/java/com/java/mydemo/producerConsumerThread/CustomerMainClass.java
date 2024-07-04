package com.java.mydemo.producerConsumerThread;

public class CustomerMainClass {

    public static void main(String[] args){
        Amazon amazon = new Amazon();
        Receive rc = new Receive(amazon);
        Deliver dr = new Deliver(amazon);
        dr.start();
        rc.start();
    }
}
