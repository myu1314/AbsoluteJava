
/*
    Author: Mark Yu
    Last Updated: 11/16/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP13 {
  public static int MIN_HEIGHT = 5;
  public static int MIN_WEIGHT = 110;
  public static int POUNDS_PER_INCH = 5;
  public static int CONVERSION_FT_TO_IN = 12;

  public static void main(String[] args) throws Exception {
    String word = " ";
    boolean again = true;
    int length;
    int max = 0;
    Scanner fileIn = null;
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\words.txt"));
      while (fileIn.hasNextLine()) {
        word = fileIn.nextLine();
        length = word.length();
        if (max < length){
          max = length;
          if (again){
          for(int letterNum = 0; letterNum < Math.floor(length/2.0); letterNum++){
            System.out.println(letterNum);
            if (word.charAt(length - letterNum-1) == word.charAt(letterNum)){
              again = true;
            }
            else{
              again = false;
            }
          }
          System.out.println(word);
        }
        }
      }


      // ABBA DID
     

    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
  }
}