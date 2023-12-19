
/*
    Author: Mark Yu
    Last Updated: 11/16/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP12 {
  public static int MIN_HEIGHT = 5;
  public static int MIN_WEIGHT = 110;
  public static int POUNDS_PER_INCH = 5;
  public static int CONVERSION_FT_TO_IN = 12;

  public static void main(String[] args) throws Exception {
    String name = " ";
    int namefeet = 0;
    int nameinch = 0;
    int nameweight = 0;
    Scanner fileIn = null;
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\ch3_PP12.txt"));
      while (fileIn.hasNextLine()) {
        name = fileIn.nextLine();
        namefeet = fileIn.nextInt();
        nameinch = fileIn.nextInt();
        nameweight = ((namefeet * CONVERSION_FT_TO_IN + nameinch) - MIN_HEIGHT * CONVERSION_FT_TO_IN)
            * POUNDS_PER_INCH + MIN_WEIGHT;
        if (fileIn.hasNextLine()) {
          fileIn.nextLine();
        }
         System.out.println(name + " should be " + nameweight + "lbs at " + namefeet + " ft " + nameinch + " inches");
      }
     

    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
  }
}
// ****************************OUTPUT**************************************
// Tom Atto should be 185lbs at 6 ft 3 inches
// Eaton Wright should be 135lbs at 5 ft 5 inches
// Cary Oki should be 165lbs at 5 ft 11 inches