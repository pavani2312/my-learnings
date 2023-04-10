package com.beginner;

public class Methods {
    public static void main(String[] args) {
        hello();
        getAMethodWithParameters(5);
        System.out.println("The total amount after 10% discount is: "+getATenPercentDiscount(20000));
        System.out.println("The total amount after 50% discount is: "+getDiscount(20000, 50));
        System.out.println("The total amount after 40% discount is: "+getDiscount(20000, 60));
        System.out.println(checkTheEfficiencyLevel('c'));
        carDescription("Tesla Roadster",2018,"good");
    }

    static void hello(){
        System.out.println("Hello!!");
    }

    static void getAMethodWithParameters(int repeatNo){
        for(int i=1; i<=repeatNo; i++){
            System.out.println("This is For loop in A method");
        }
    }
    static double getATenPercentDiscount(int price){
        return price * 0.9;
    }

    //Method Overloading
    static double getDiscount(int price, int percent){
        return price * percent/100.0;
    }
    static double getDiscount(double price, int percent){
        return price * percent/100;
    }


        static String checkTheEfficiencyLevel(char energyEfficiencyCategory)
        {
            switch (energyEfficiencyCategory) {
                case 'A':
                case 'a':
                    return "very low efficiency";

                case 'B':
                case 'b':
                    return"low efficiency";

                case 'C':
                case 'c':
                    return "normal efficiency";

                case 'D':
                case 'd':
                  return "above normal efficiency";

                case 'E':
                case 'e':
                    return "high efficiency";

                case 'F':
                case 'f':
                   return "very high efficiency";

                case 'G':
                case 'g':
                    return "extremely high efficiency";

                default:
                    return "No valid efficiency";
            }
        }


        static void carDescription( String model, int productionYear,String condition){
        if(condition == "good" || condition == "bad" || condition == "damaged"){
            System.out.println("This car is a " +model +
                    "\nProduction year: " +productionYear +
                    "\nIt’s in " +condition+" condition");
        }
        }
        }




