package com.numberPrograms;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 10;
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag += 1;
            }}
        if (flag == 2)
            System.out.println(n + " Is Prime No");
        else
            System.out.println(n + " Is not a Prime No");
        //Perfect Number
//        int flag = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                flag = flag + i;
//            }
//        }
//        if (flag == n)
//            System.out.println(n + " Is Perfect No");
//        else
//            System.out.println(n + " Is not a Perfect No");
    }
    }



