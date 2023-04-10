package com.patterns;

public class Hill {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < i ; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
        //Hollow Hill
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n; j++) {  // 1st Triangle
                System.out.print("  ");
            }
            for (int j = 1; j < i ; j++) { // 2nd Triangle
                if (i == n || j == 1) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) { // 3rd Triangle
                if (i ==n || j == i){
                System.out.print("* ");}
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
