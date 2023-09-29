
/*
    Author: Mark Yu
    Last Updated: 9/22/2023
    Description: Changing Lines
  
  
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class twoPP12 {
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("Ch02\\rsc\\Ch2_PP12.txt"));
            String oLine = fileIn.nextLine();
            String phraseOfChange = "hate";
            String phraseToChangeItTo = "love";
            int posOfHate = oLine.indexOf(phraseOfChange);
            String newString = oLine.substring(0, posOfHate) + phraseToChangeItTo
                    + oLine.substring(posOfHate + phraseOfChange.length(), oLine.length());
            System.out.println("I have rephrased that line to read:\n" + '"' + newString + "\"");

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");

        }
    }
}
/*
 * ****************************OUTPUT**************************************
 * I have rephrased that line to read:
 * "I love you"
 */