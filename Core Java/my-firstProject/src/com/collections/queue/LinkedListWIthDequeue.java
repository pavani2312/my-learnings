package com.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListWIthDequeue {
    public static void main(String[] args) {

        Deque<Integer> bankQueueNumbers = new LinkedList<>();

        bankQueueNumbers.addLast(30);
        bankQueueNumbers.addFirst(31);
        bankQueueNumbers.offerFirst(32);
        bankQueueNumbers.offerFirst(33);
        bankQueueNumbers.offerLast(34);
        System.out.println("The Bank Customers Waiting numbers are: " +bankQueueNumbers);

        System.out.println("Get the 1st element in the queue: " +bankQueueNumbers.getFirst());

        System.out.println("Remove the First element from the queue: " +bankQueueNumbers.removeFirst());
        System.out.println("Remove the last element from the queue: " +bankQueueNumbers.pollLast());

    }
}
