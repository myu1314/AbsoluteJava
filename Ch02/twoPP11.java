/*
    Author: Mark Yu
    Last Updated: 9/18/2023
    Description: Report Thing
  
  
*/

import java.util.Scanner;

public class twoPP11 {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        final double PERCENTAGE_CONVERSION = 100;
        //Getting Information for Exersise 1
        System.out.print("Input the name of exersise 1: ");
        String nameOfE1= keyboard.nextLine();
        String nameOfE1FirstCharacter = nameOfE1.substring(0,1);
        nameOfE1FirstCharacter = nameOfE1FirstCharacter.toUpperCase();
        String nameOfE1LastCharacters = nameOfE1.substring(1,nameOfE1.length());
        String nameOfE1Result = nameOfE1FirstCharacter + nameOfE1LastCharacters;
        System.out.print("Score recieved for exeresise 1: ");
        int scoreE1 = keyboard.nextInt();
        System.out.print("Total Points. ");
        double totalPointsE1 = keyboard.nextDouble();
        keyboard.nextLine(); 

        //Getting Information for Exersise 2
         System.out.print("Input the name of exersise 2: ");
        String nameOfE2= keyboard.nextLine();
        String nameOfE2FirstCharacter = nameOfE2.substring(0,1);
        nameOfE2FirstCharacter = nameOfE2FirstCharacter.toUpperCase();
        String nameOfE2LastCharacters = nameOfE2.substring(1,nameOfE2.length());
        String nameOfE2Result = nameOfE2FirstCharacter + nameOfE2LastCharacters;
        System.out.print("Score recieved for exeresise 2: ");
        int scoreE2 = keyboard.nextInt();
        System.out.print("Total Points. ");
        double totalPointsE2 = keyboard.nextDouble();
        keyboard.nextLine(); 

        //Getting Information for Exersise 3
        System.out.print("Input the name of exersise 3: ");
        String nameOfE3= keyboard.nextLine();
        String nameOfE3FirstCharacter = nameOfE3.substring(0,1);
        nameOfE3FirstCharacter = nameOfE3FirstCharacter.toUpperCase();
        String nameOfE3LastCharacters = nameOfE3.substring(1,nameOfE3.length());
        String nameOfE3Result = nameOfE3FirstCharacter + nameOfE3LastCharacters;
        System.out.print("Score recieved for exeresise 3: ");
        int scoreE3 = keyboard.nextInt();
        System.out.print("Total Points. ");
        double totalPointsE3 = keyboard.nextDouble();
        keyboard.nextLine(); 

        // Calculating the total amount of money needed
        double totalPoints = totalPointsE1 + totalPointsE2 + totalPointsE3;
        double achievedPoints = scoreE1 + scoreE2 + scoreE3;
        double percentage = achievedPoints/totalPoints * PERCENTAGE_CONVERSION;
        //Outputing the final calculations in a list format
        String heading1 = "Exersise";
        String heading2 = "Score";
        String heading3 = "Total Possible";     
    

        System.out.println("Your Report:");
        System.out.println("===========================================================");
        System.out.printf("%-30s%-10s|%-10s\n",heading1,heading2,heading3);
        System.out.printf("%-30s%-10d|%-10.0f \n",nameOfE1Result,scoreE1,totalPointsE1);
        System.out.printf("%-30s%-10d|%-10.0f \n",nameOfE2Result,scoreE2,totalPointsE2);
        System.out.printf("%-30s%-10d|%-10.0f \n",nameOfE3Result,scoreE3,totalPointsE3);
        System.out.printf("%-30s%-20.0f%-10.0f\n","Total", achievedPoints, totalPoints);
        System.out.printf("Your total is %.2f out of %.2f, or %.2f%%\n",achievedPoints,totalPoints,percentage);
        keyboard.close();

    }
}
/*
 * ****************************OUTPUT**************************************
 * Input the name of exersise 1: Math
 * Score recieved for exeresise 1: 10
 * Total Points. 10
 * Input the name of exersise 2: Science
 * Score recieved for exeresise 2: 9
 * Total Points. 10
 * Input the name of exersise 3: English
 * Score recieved for exeresise 3: 10
 * Total Points. 10
 * Your Report:
 * ===========================================================
 * Exersise                      Score     |Total Possible
 * Math                          10        |10
 * Science                       9         |10
 * English                       10        |10
 * Total                         29                  30
 * Your total is 29.00 out of 30.00, or 96.67%
 */