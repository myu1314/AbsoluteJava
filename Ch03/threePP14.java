
/*
    Author: Mark Yu
    Last Updated: 11/16/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP14 {

  public static void main(String[] args) throws Exception {
    String word = " ";
    boolean again = true;
    int length;
    int vowelLength = 0;
    int maxCount = 0;
    int letterDec = 0;
    int longestVowelInWord = 0;
    String longestWord = " ";
    Scanner fileIn = null;
    // int letter1;
    // int letter2;
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\words.txt"));
      while (fileIn.hasNextLine()) {
        longestVowelInWord = 0;
        vowelLength = 0;
        word = fileIn.nextLine();
        length = word.length();
        for (int letterNum = 1; letterNum < length; letterNum++) {
          letterDec = word.charAt(letterNum);
            if (isAVowel(letterDec)){
             vowelLength += 1;
            }
            else {
              if (longestVowelInWord <= vowelLength){
                longestVowelInWord = vowelLength;
              }
              
              vowelLength = 0;
            }
          }
           System.out.println(longestVowelInWord);
          System.out.println(word);
        }
       
        

      }
      // ABBA DID
    catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
  }

  static boolean isAVowel(int letter) {
    if (letter == 97) {
      return true;
    } else if (letter == 101) {
      return true;
    } else if (letter == 105) {
      return true;
    } else if (letter == 111) {
      return true;
    } else if (letter == 117) {
      return true;
    } else {
      return false;
    }

  }
}