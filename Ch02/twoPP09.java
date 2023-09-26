/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class twoPP09 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Phrase?");
        String phraseOfChange = keyboard.next();
        String oLine = "I hate you";
        String phraseToChangeItTo = "love";
        System.out.println("The line of text to be changed is:\n" + '"' + oLine +"\"");
        int posOfHate = oLine.indexOf("hate");
        String newString = oLine.substring(0,posOfHate) + phraseToChangeItTo + oLine.substring(posOfHate + phraseOfChange.length());
        System.out.println("I have rephrased that line to read:\n" + '"' + newString +"\"");
        keyboard.close();
            
    }
}
/*
 * ****************************OUTPUT**************************************
 * Phrase?
 * I hate you
 * The line of text to be changed is:
 * "I hate you"
 * I have rephrased that line to read:
 * "I loveate you"
 */