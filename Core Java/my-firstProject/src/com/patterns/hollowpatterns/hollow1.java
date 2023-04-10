package com.patterns.hollowpatterns;

public class hollow1 {
    public static void main(String[] args) {
        int num = 5;
        //  |  | pattern
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 1; j <= num ; j++) {
//                if(j == 1 || j == num){
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
        //X pattern
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 1; j <= num ; j++) {
//                if(i == j || (i + j) == (num+1)){
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
        //Square hollow pattern
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 1; j <= num ; j++) {
//                if(i == 1 || j == 1 || i == num || j == num){
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
        //Increasing Hollow pattern
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                if(j == 1 || i == num || i == j ){
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
        //Decreasing Hollow Pattern
        for (int i = 1; i <= num ; i++) {
            for (int j = i; j <= num ; j++) {
                if( i == 1 ||j == i || j == num){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
