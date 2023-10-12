/*
    Author: Mark Yu
    Last Updated: 10/9/2023
    Description:  Inflation Calcuator
  
  
*/

import java.util.Scanner;

public class threePP04 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double currentPrice;
        double futurePrice;
        double yearsFromNow;
        double inflation;
        System.out.println("What is the current price:");
        currentPrice = keyboard.nextDouble();
        System.out.println("What is the inflation rate (as a percent):");
        inflation = keyboard.nextDouble();
        inflation = inflation/100;
        System.out.println("How many years in the future will it be: ");
        yearsFromNow = keyboard.nextDouble();
        for(int years = 0; years <= yearsFromNow; years++){
            currentPrice += currentPrice * inflation;
        }
        futurePrice = currentPrice;
        System.out.printf("The price %2.2f years into the future is: $%2.2f \n",yearsFromNow, futurePrice);
        keyboard.close();
    }
   

}
/*
 * ****************************OUTPUT**************************************
 * What is the current price:
 * 100
 * What is the inflation rate (as a percent):
 * 5
 * How many years in the future will it be:
 * 5
 * The price 5.00 years into the future is: $134.01
 */