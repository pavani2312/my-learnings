package com.datastructures;

import java.util.Scanner;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = scanner.nextInt();
        System.out.println("Enter the array Elements:");
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = arr.length;
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i-1;
            while ((j >= 0) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("The Sorted elements are: ");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
