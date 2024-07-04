package com.java.mydemo.ThreadConcept;

public class ThreadMainClass {

//this main method is only created for Thread concept, this is not main method for project
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        synchronized (mt){
            mt.wait();
            System.out.println("Value of is "+ mt.value);
        }

    }
}
