package com.datastructures;

import java.util.Scanner;

public class SelectionSortAlgo {
    public static void sorting(int arr[], int num){
        for (int i = 0; i < num -1; i++) {
            int min = i;
            for (int j = i+1; j < num; j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        SelectionSortAlgo.sorting(arr, number);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " +arr[i]);
        }
    }
}
