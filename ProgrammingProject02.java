/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class ProgrammingProject02 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your first name and last name? ");
        String firstName = keyboard.next();
        String lastName = keyboard.next();
        String fNFirstLetter = firstName.substring(0,1);
        String fNSecondLetter = firstName.substring(1,2);
        fNSecondLetter = fNSecondLetter.toUpperCase();  
        String fNEndingLetters = firstName.substring(2,firstName.length());
        String fNResult = fNSecondLetter + fNEndingLetters + fNFirstLetter + "ay";
        String lNFirstLetter = lastName.substring(0,1);
        String lNSecondLetter = lastName.substring(1,2);
        lNSecondLetter = lNSecondLetter.toUpperCase();
        String lNEndingLetters = lastName.substring(2,lastName.length());
        String lNResult = lNSecondLetter + lNEndingLetters + lNFirstLetter + "ay";
        String finalResults =  fNResult + " " + lNResult;
        System.out.println("Your name in Pig Latin is: " + finalResults);
     }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */