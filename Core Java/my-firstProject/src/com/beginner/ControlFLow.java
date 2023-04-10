package com.beginner;

public class ControlFLow {
    public static void main(String[] args) {
//        boolean isDamaged = true;
//        String carColor = "purple";
//        char energyEfficiencyCategory = 'G';
//
//        //if
//        if(isDamaged){
//            System.out.println("This is damaged car");
//        }else
//            System.out.println("Not a damaged car");
//        System.out.println();
//        //if-else if
//        if(carColor.equals("red")){
//            System.out.println("This is a red car");
//        }else if(carColor.equals("green")){
//            System.out.println("This is a green car");
//        }else if(carColor.equals("blue")){
//            System.out.println("This is a blue car");
//        }else
//            System.out.println("I dont know what color car is this!!");
//
//        //switch statement
//        switch(energyEfficiencyCategory){
//            case 'A':
//            case 'B':
//                System.out.println("Low Efficiency Car");
//            case 'G':
//                System.out.println("High Efficiency Car");
//        }
      //some practise example//
        // char answer = 'C';
//        System.out.println("Who is named as the Father of the Light Bulb?");
//        switch(answer){
//            case 'A':
//                System.out.println("Nikola Tesla");
//                break;
//            case 'B':
//                System.out.println("Marie Curie");
//                break;
//            case 'C':
//                System.out.println("Tomas Edison");
//                break;
//            case 'D':
//                System.out.println("Robert Oppenheimer");
//                break;
//            default:
//                System.out.println("Not in options");
//                break;
//        }

        //Code Blocks
        {
            int noOfOwners = 5;
            {
                noOfOwners++;
            }
            System.out.println(noOfOwners);
        }
    }
}
