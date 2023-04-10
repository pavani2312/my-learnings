package com.numberPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10, temp, num1 = 0, num2 =1;
        System.out.println(num1 +"\n"+num2);
        for (int i = 0; i <= num ; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.println(temp);
        }
    }
}
