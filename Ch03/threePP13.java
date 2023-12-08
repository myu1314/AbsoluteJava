
/*
    Author: Mark Yu
    Last Updated: 11/16/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP13 {
  public static void main(String[] args) throws Exception {
    String word = " ";
    boolean again = true;
    int length;
    int max = 0;
    String longestWord = " ";
    Scanner fileIn = null;
    //int letter1;
    //int letter2;
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\words.txt"));
      while (fileIn.hasNextLine()) {
        word = fileIn.nextLine();
        length = word.length();
        if (max < length) { 
            for (int letterNum = 0; letterNum <= Math.floor(length / 2.0); letterNum++) {
              //letter1 = word.charAt(length - letterNum - 1);
              //letter2 = word.charAt(letterNum);
              if (word.charAt(length - letterNum - 1) == word.charAt(letterNum)) {
                again = true;
                
                //System.out.println(letter1 + " is equal to "+ letter2 );
                //System.out.println( "word " + word);
                //System.out.println("letter num" + letterNum);
                //System.out.println("length" + length);
              } else {
                //System.out.println(word + " is not a palindrome.");
                //System.out.println(max + " max.");
                again = false;
                break;
              }
            
          }
          if (again){
            longestWord = word;
            
          }
          
          
        }
        
      }
      System.out.println(longestWord + " is the longest palindrome.");

      // ABBA DID

    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
  }
}
// ****************************OUTPUT**************************************
// refer is the longest palindrome.