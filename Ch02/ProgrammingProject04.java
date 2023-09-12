/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class ProgrammingProject04 {
    public static void main(String[] args) throws Exception {
        
        System.out.print("How much distance was traveled? ");
        Scanner distancePrompt = new Scanner(System.in);
        double miles = distancePrompt.nextDouble();
        System.out.print("How many miles can automobile travel per gallon? ");
        Scanner MPGPrompt = new Scanner(System.in);
        double MPG = MPGPrompt.nextDouble();
        System.out.print("What is the cost per gallon? ");
        Scanner CPGPrompt = new Scanner(System.in);
        double CPG = CPGPrompt.nextDouble();
        double cost = miles/MPG * CPG;
        System.out.printf("The cost of your trip is $%5.2f",cost);

    }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */