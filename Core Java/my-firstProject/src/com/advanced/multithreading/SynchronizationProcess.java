package com.advanced.multithreading;

import static java.lang.Thread.sleep;

class A{
   synchronized void multiply(int num)  {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+ "* " +num+ " = " + (i*num) );
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    A obj;
    MyThread1(A obj){
        this.obj = obj;
    }
    @Override
    public void run(){
        obj.multiply(5);
    }
}

class MyThread2 extends Thread{
    A obj;
    MyThread2(A obj){
        this.obj = obj;
    }
    @Override
    public void run(){
        obj.multiply(20);
    }
}
public class SynchronizationProcess {
    public static void main(String[] args) {
        A a = new A();
        MyThread1 myThread1 = new MyThread1(a);
        MyThread2 myThread2 = new MyThread2(a);
        myThread1.start();
        myThread2.start();
    }
}
