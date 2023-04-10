package com.beginner;

public class Operators {
    public static void main(String[] args) {
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyBalanceInBank = 100000;
        boolean isDamaged = true;
        System.out.println("The price of the car is : $"+price);
        //com.beginner.Operators
        int increasedPrice = price + 1000;
        System.out.println("The Increased price of "+carModel+ " is: $"+increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.println("The Decreased price of "+carModel+ " is: $"+decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Two "+carModel+ " price is: $"+twoCarsPrice);
        int carsYouCanByWithBalance = moneyBalanceInBank / price;
        System.out.println("From the bank balance you can buy "+carsYouCanByWithBalance+ " "+carModel+"'s");
        int remainingBalance = moneyBalanceInBank % price;
        System.out.println("Money left in bank after buying the "+carsYouCanByWithBalance+ " "+carModel+" is: $"+remainingBalance);
        System.out.println();


        int negativePrice = -14999;
        int negativePriceWithPlus = +negativePrice;
        System.out.println("The negative price with plus is: $"+negativePriceWithPlus);
        int negativePriceWithMinus = -negativePrice;
        System.out.println("The negative price with minus is: $"+negativePriceWithMinus);
        int priceIncrement = ++price;
        System.out.println("The incremented price Value is: $"+priceIncrement);
        int priceDecrement = --price;
        System.out.println("The decremented price values is: $"+priceDecrement);
        System.out.println("This car is damaged: " +!isDamaged);
        System.out.println();

        System.out.println("Checking if car price and bank balance is equal: " +(price==moneyBalanceInBank));
        System.out.println("Checking if car price and bank balance is not equal: " +(price!=moneyBalanceInBank));
        System.out.println("Checking if car price is greater than bank balance : " +(price>moneyBalanceInBank));
        System.out.println("Checking if car price is lesser than bank balance : " +(price<moneyBalanceInBank));
        System.out.println("Checking if car price is greater than equal to bank balance : " +(price>=moneyBalanceInBank));
        System.out.println("Checking if car price is lesser than equal to  bank balance : " +(price<=moneyBalanceInBank));
        System.out.println("Checking if car model variable is String or not: " +(carModel instanceof String));
        System.out.println();
        //Ternary Operator
        String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.println(damagedText);
        System.out.println();

        //Logical com.beginner.Operators
        String worthSeeing = !isDamaged || price <= 20000 ? "It's worth seeing" : "It's not worth seeing";
        System.out.println(worthSeeing);
        String worthRepairing = isDamaged && price <= 10000 ? "It's worth repairing" : "It's not worth repairing";
        System.out.println(worthRepairing);
        System.out.println();

        //Assignment Operator
        price += 1000;
        System.out.println("The Increased Price: $"+price);
        price -= 2000;
        System.out.println("The Decreased Price: $"+price);
        price *= 2;
        System.out.println("The Multiplied Price: $"+price);
        price /= 2;
        System.out.println("The Divided Price: $"+price);
        price %= 10000;
        System.out.println("The Remainder Price: $"+price);







    }
}
