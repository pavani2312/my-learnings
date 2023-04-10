package com.datastructures;

import java.util.Scanner;

public class QuickSortAlgo {
    public static int partition(int arr[], int low, int high){
        int i = low - 1;
        int j = high + 1;
        int pivotVal = arr[high];
        while (true){
            while (arr[++i] < pivotVal){}
            while (j > 0 && arr[--j] > pivotVal){}
            if(i >= j){
                break;}
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low >= high)
            return;
        else {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot +1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int number = scanner.nextInt();
        System.out.println("Enter the "+number+" elements in the array:");
        int arr[] = new int[number];
        for (int i =0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The Sorted elements are as follows: " );
        QuickSortAlgo.quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " +arr[i]);
        }
    }

}
