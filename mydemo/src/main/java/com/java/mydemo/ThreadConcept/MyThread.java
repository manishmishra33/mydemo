package com.java.mydemo.ThreadConcept;

public class MyThread extends Thread{
    int value = 0;
    @Override
    public void run() {

        synchronized (this){

            for(int i =1;i<=10; i++){
                value = value+100;
            }
            this.notify();
        }

    }


}

