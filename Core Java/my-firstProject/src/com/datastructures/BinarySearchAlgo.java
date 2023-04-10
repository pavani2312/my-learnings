package com.datastructures;

import java.util.Scanner;

public class BinarySearchAlgo {

    public static int search(int arr[], int num, int high, int low){
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == num){
                return mid;
            }
            else if(num < arr[mid]){
                high = mid -1;
            }
            else if(num > arr[mid]){
                low = mid + 1;
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to be found: ");
        int num = scanner.nextInt();

        int index = BinarySearchAlgo.search(arr, num, arr.length,0 );
        if(index == -1){
            System.out.println(num+ " is not present in the array " );}
        else
            System.out.println(num+ " found at position " + index);
    }
}

