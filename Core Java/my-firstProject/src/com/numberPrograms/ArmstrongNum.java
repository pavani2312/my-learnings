package com.numberPrograms;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num =372;
        int sum =0;
        int copyNum = num;

        while (copyNum != 0) {
                int rem = copyNum % 10;
                sum = sum + (rem * rem * rem);
                copyNum = copyNum / 10;
            }
        if (sum == num)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");
    }
}

