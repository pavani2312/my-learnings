package com.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 1; i < n ; i++) {
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
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j < n ; j++) {
//                System.out.print("* ");
//            }
//            for(int j =i; j <= n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Diamond Hollow
        for (int i = 1; i < n ; i++) {
            for (int j = i; j <= n; j++) { //1
                System.out.print("  ");
            }
            for (int j = 1; j < i ; j++) { //2
                if ( j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) { //3
                if (j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) { //4
                System.out.print("  ");
            }
            for (int j = i; j < n ; j++) { //5
                if (j == i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j =i; j <= n; j++){ //6
                if (j == n)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
