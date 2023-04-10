package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListApp {
    public static void main(String[] args) {
        Queue<Integer> bankQueueNumbers = new LinkedList<>();

        bankQueueNumbers.add(30);
        bankQueueNumbers.offer(31);
        bankQueueNumbers.offer(32);
        bankQueueNumbers.offer(33);
        bankQueueNumbers.offer(34);
        System.out.println("The Bank Customers Waiting numbers are: " +bankQueueNumbers);

        System.out.println("Get the 1st element in the queue: " +bankQueueNumbers.element());

        System.out.println("Remove the element from the queue: " +bankQueueNumbers.remove());
        System.out.println("Remove the element from the queue: " +bankQueueNumbers.poll());
    }
}
