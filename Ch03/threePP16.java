
/*
    Author: Mark Yu
    Last Updated: 12/13/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP16 {
  
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    Scanner fileIn = null;
    String phrase;
    int letterCount=0;
    String letterToCheck;
    String letter;
    System.out.println("Letter to check: ");
    letterToCheck = keyboard.nextLine();
    // int letter1;
    // int letter2;
    System.out.println("The letter " + letterToCheck + " is the first letter in these words:");
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\ch3_PP16.txt"));
      while (fileIn.hasNextLine()) {
        phrase = fileIn.next();
        letter = phrase.substring(0,1);
        if (letter.equals(letterToCheck)){
          letterCount +=1;
          System.out.println('"' + phrase + '"');
        }
      }
      System.out.println("In total, the letter appeared " + letterCount + " times.");
      
     
    }
      // ABBA DID
    catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
    keyboard.close();
  }
  
}
// ****************************OUTPUT**************************************
// Letter to check: 
// a
// The letter a is the first letter in these words:
// "author"
// "and"
// "and"
// "at"
// In total, the letter appeared 4 times.
