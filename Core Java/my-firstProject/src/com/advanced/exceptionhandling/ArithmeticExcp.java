package com.advanced.exceptionhandling;

public class ArithmeticExcp {

    public static int divide(int dividend, int divisor){
        try {
            if (divisor == 0){
                throw new CustomException("Zero is not allowed");
            }
            return dividend/divisor;
        }catch (CustomException|ArithmeticException exception){
            System.err.println(exception.getMessage());
            return 0;
        }finally {
            System.out.println("This is better when using database connections and files closing");
        }

    }

    public static void main(String[] args) {
        System.out.println(divide(25, 5));
        System.out.println(divide(10,0));
    }
}
