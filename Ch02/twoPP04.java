/*
    Author: Mark Yu
    Last Updated: 9/8/2023
    Description: Gas Prices
  
  
*/

import java.util.Scanner;

public class twoPP04 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("How much distance was traveled? ");
        
        double miles = keyboard.nextDouble();
        System.out.print("How many miles can automobile travel per gallon? ");
       
        double MPG = keyboard.nextDouble();
        System.out.print("What is the cost per gallon? ");

        double CPG = keyboard.nextDouble();
        double cost = miles/MPG * CPG;
        System.out.printf("The cost of your trip is $%5.2f",cost);
        keyboard.close();

    }
}
/*
 * ****************************OUTPUT**************************************
 * How much distance was traveled? 100
 * How many miles can automobile travel per gallon? 10
 * What is the cost per gallon? 5
 * The cost of your trip is $50.00
 */