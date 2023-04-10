package com.stringPrograms;

public class StringEqualsMethodAndOperator {
    public static void main(String[] args) {
        int num1 = 5, num2 = 5;
        String stringLiterals = "Hello";
        String stringNew = new String("Hello");

        System.out.println("Primitive == : "+(num1 == num2));
        System.out.println("String Object equals() : " +stringLiterals.equals(stringNew)); // checks values
        System.out.println("String Object Literals: " +stringLiterals == stringNew); //checks reference variables
    }
}
