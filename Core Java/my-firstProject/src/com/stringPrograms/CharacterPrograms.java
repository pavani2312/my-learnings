package com.stringPrograms;

public class CharacterPrograms {
    public static void main(String[] args) {
        String string = "This is A String";
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            System.out.println("Every character in a new Line:" +ch);
//        }
        //Characters Ascii value
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            int charNo = (int) ch;
//            System.out.println("Every character in a new Line: " +ch+ " and its value: " +charNo );
//        }
        //To convert to UpperCase
//        int count =0;
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            if(Character.isUpperCase(ch))
//                count++;
//            //System.out.println("Uppercase Character in a new Line:" +ch);
//        }
//        System.out.println("Count of Uppercase Character in the String:" +count);

        //To create a new string from the old string
//        String newStr = "";
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//            if (Character.isUpperCase(ch)){
//                newStr = newStr + ch;
//            }
//        }
//        System.out.print(newStr);

        //To reverse the String
        String rev ="";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
