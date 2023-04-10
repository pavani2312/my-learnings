package com.datastructures;

import java.util.Scanner;

public class LinearSearchAlgo {
    public static int linear(int arr[], int len, int num){
        for (int i = 0; i < len; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = scanner.nextInt();
        System.out.println("Enter the " +len + " numbers:");
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to be found: ");
        int num = scanner.nextInt();

        int index = LinearSearchAlgo.linear(arr, len, num);
        if (index == -1)
            System.out.println(num+ " is not present in the array");
        else
            System.out.println(num+ " found at position " + index);
    }
}
