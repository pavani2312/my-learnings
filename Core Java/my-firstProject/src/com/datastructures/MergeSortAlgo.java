package com.datastructures;

import java.util.Scanner;

public class MergeSortAlgo {
    public static void merge(int arr[], int start, int mid,int end){
        int arrLeft[] = new int[mid-start +1];
        int arrRight[] = new int[end-mid];
        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[start + i];
        }
        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = arr[mid + i + 1];
        }
        int i =0, j =0;
        while (i < arrLeft.length && j <arrRight.length){
            if(arrLeft[i] < arrRight[j]){
                arr[start++] = arrLeft[i++];
            }else {
                arr[start++] = arrRight[j++];
            }
        }
        while (i < arrLeft.length){
            arr[start++] = arrLeft[i++];
        }
        while (j < arrRight.length){
            arr[start++] = arrRight[j++];
        }
    }

    public static void mergeSort(int arr[], int start, int end){
        if(start == end)
            return ;
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid +1, end);
        merge(arr, start, mid, end);
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
        MergeSortAlgo.mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " +arr[i]);
        }

    }
}
