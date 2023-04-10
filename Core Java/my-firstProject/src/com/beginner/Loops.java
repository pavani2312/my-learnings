package com.beginner;

public class Loops<j> {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i <= 5) {
            System.out.println(i + ". Doing Java Practise");
            i++;
        }
        System.out.println("Value of I after looping " +i);
        System.out.println();

//        //do while
        int j = 1;
        do {
            System.out.println(j + ". Being Right Sucks.");
            j++;
        } while (j <= 5);
        System.out.println("Value of J after looping "+j);
        System.out.println();

        //for & continue
        for(int k=1; k<=5; k++){
            if(k==3){
                continue;
            }
            System.out.println(k+". using For Loop");
        }
        System.out.println();
        //for and break
        for(int k=1; k<=5; k++){
            if(k==3){
                break;
            }
            System.out.println(k+". Using For with break");
        }
        //for inside for
        for(int k=1; k<=5; k++){
            for(int l=1; l<=2; l++){
                System.out.println("k = "+k + " ,l = "+l +". Using for loop");
            }
        }

    }

}
