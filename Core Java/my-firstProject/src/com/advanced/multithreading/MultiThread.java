package com.advanced.multithreading;
class One extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 5; i++) {
//            if (i == 2)
//                Thread.yield();
            System.out.println("This is from 1st thread i = " +i);
        }
        System.out.println("Stopping the thread one");
    }
}

class Two extends Thread{
    @Override
    public void run(){
        for (int j = 1; j < 5; j++) {
            System.out.println("This is from 2nd thread j = " +j);
            //if (j == 3) stop();
        }
        System.out.println("Stopping the thread two");
    }
}

class Three extends Thread{
    @Override
    public void run(){
        for (int k = 1; k < 5; k++) {
//            if (k == 3) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            System.out.println("This is from 3rd thread k =" +k);

        }
        System.out.println("Stopping the thread three");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        Three three = new Three();
        one.setPriority(Thread.MIN_PRIORITY);
        two.setPriority(one.getPriority() + 1);
        three.setPriority(Thread.MAX_PRIORITY);
        one.start();
        two.start();
        three.start();
    }
}
