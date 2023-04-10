package com.datastructures;

import java.util.Scanner;

public class BubbleSortAlgo {
    public static void sorting(int arr[], int num){
        for (int i = 0; i < (num - 1); i++) {
            for (int j = 0; j < (num-1-i); j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int number = scanner.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[] = new int[number];
        for (int i =0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("The Sorted elements are as follows: " );
        BubbleSortAlgo.sorting(arr, number);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " +arr[i]);
        }

    }
}
