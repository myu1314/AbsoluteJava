/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class ProgrammingProject05 {
     public static void main(String[] args) throws Exception {
        System.out.print("Input the name of the item? ");
        Scanner item1NamePrompt = new Scanner(System.in);
        String item1Name = item1NamePrompt.next();
        String item = item.toLowerCase();

        System.out.print("What was the price to purchase of the item");
        Scanner purchasePrompt = new Scanner(System.in);
        double purchasePrice = purchasePrompt.nextDouble();

        System.out.print("How much did the item sell for? ");
        Scanner salvagePrompt = new Scanner(System.in);
        double salvagePrice = salvagePrompt.nextDouble();

        System.out.print("For how many years was it in use? ");
        Scanner YearsPrompt = new Scanner(System.in);
        double yearsInUse = YearsPrompt.nextDouble();


        double yearlyDepriciation = (purchasePrice - salvagePrice)/yearsInUse;
        System.out.printf("The yearly depriciation of the %s is $%5.2f",item,yearlyDepriciation);
    }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */