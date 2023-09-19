/*
    Author: Mark Yu
    Last Updated: 9/18/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class twoPP08{
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cost of item");
        double itemCost = keyboard.nextDouble();
        double returnAmount = 1.00 - itemCost;
        System.out.printf("%-30s\n","Recipt");
        System.out.printf("%-30s%-30.2f \n","Cost:",itemCost);
        System.out.printf("%-30s%-30s\n","Amount Given:","$1.00");       
        System.out.printf("%-30s%-30s\n","Change:",returnAmount); 
        keyboard.close();
            
    }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */