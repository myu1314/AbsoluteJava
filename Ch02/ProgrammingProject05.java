/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class ProgrammingProject05 {
     public static void main(String[] args) throws Exception {
        System.out.print("Input the name of the item? ");
        Scanner keyboard = new Scanner(System.in);

        String item1Name = keyboard.next();
        String item = item1Name.toLowerCase();

        System.out.print("What was the price to purchase of the item");
        double purchasePrice = keyboard.nextDouble();

        System.out.print("How much did the item sell for? ");
        double salvagePrice = keyboard.nextDouble();

        System.out.print("For how many years was it in use? ");
        double yearsInUse = keyboard.nextDouble();


        double yearlyDepriciation = (purchasePrice - salvagePrice)/yearsInUse;
        System.out.printf("The yearly depriciation of the %s is $%5.2f",item,yearlyDepriciation);
        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */