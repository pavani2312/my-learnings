package com.advanced.multithreading;

class OneR implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println("This is from 1st thread " +i);
        }
        System.out.println("Stopping the thread one----------");
    }
}

class TwoR implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println("This is from 2nd thread " +i);
        }
        System.out.println("Stopping the thread two-----------");
    }
}

class ThreeR implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println("This is from 3rd thread " +i);
        }
        System.out.println("Stopping the thread three--------");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        OneR one = new OneR();
        Thread thread1 = new Thread(one);
        TwoR two = new TwoR();
        Thread thread2 = new Thread(two);
        ThreeR three = new ThreeR();
        Thread thread3 = new Thread(three);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
