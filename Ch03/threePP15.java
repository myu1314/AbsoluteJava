
/*
    Author: Mark Yu
    Last Updated: 12/13/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class threePP15 {

  public static void main(String[] args) throws Exception {
    Scanner fileIn = null;
    double times1 = 0;
    double times2 = 0;
    double times3 = 0;
    double times4 = 0;
    double times5 = 0;
    double times6 = 0;
    double times7 = 0;
    double times8 = 0;
    double times9 = 0;
    double numbers = 0;
    double total = 0;
    double percentage = 0;
    double digit = 0;
    double numberOfDigits = 0;
    // int letter1;
    // int letter2;
    try {
      fileIn = new Scanner(new FileInputStream("Ch03\\rsc\\ch3_PP15.txt"));
      while (fileIn.hasNextLine()) {
        numberOfDigits = 0;
        numbers = fileIn.nextInt();
        while (numbers/(Math.pow(10,numberOfDigits)) >= 1){
          numberOfDigits +=1;
        }
        digit = numbers/Math.pow(10,numberOfDigits-1);
        if (digit == 1) {
          times1 +=1;
        } else if (digit == 2) {
          times2 += 1;
        } else if (digit == 3) {
          times3 += 1;
        } else if (digit == 4) {
          times4 += 1;
        } else if (digit == 5) {
          times5 += 1;
        } else if (digit == 6) {
          times6 += 1;
        } else if (digit == 7) {
          times7 += 1;
        } else if (digit == 8) {
          times8 += 1;
        } else if (digit == 9) {
          times9 += 1;
        } 
        
      }

      total = (times1 + times2 + times3 + times4 + times5 + times6 + times7 + times8 + times9) * 1.00;
      percentage = times1/(total) * 100;
      System.out.println("The percentage that 1 is the first digit is: " + percentage );
      percentage = times2/(total * 1.0) * 100;
      System.out.println("The percentage that 2 is the first digit is: " + percentage );
      percentage = times3/(total * 1.0) * 100;
      System.out.println("The percentage that 3 is the first digit is: " + percentage );
      percentage = (times4 * 100)/(total * 1.0);
      System.out.println("The percentage that 4 is the first digit is: " + percentage );
      percentage = times5/(total * 1.0) * 100;
      System.out.println("The percentage that 5 is the first digit is: " + percentage );
      percentage = times6/(total * 1.0) * 100;
      System.out.println("The percentage that 6 is the first digit is: " + percentage );
      percentage = times7/(total * 1.0) * 100;
      System.out.println("The percentage that 7 is the first digit is: " + percentage );
      percentage = times8/(total * 1.0) * 100;
      System.out.println("The percentage that 8 is the first digit is: " + percentage );
      percentage = times9/(total * 1.0) * 100;
      System.out.println("The percentage that 9 is the first digit is: " + percentage );
    }
      // ABBA DID
    catch (FileNotFoundException e) {
      System.out.println("File Not Found");

    }
  }
}
// ****************************OUTPUT**************************************
// The percentage that 1 is the first digit is: 25.0
// The percentage that 2 is the first digit is: 12.5
// The percentage that 3 is the first digit is: 12.5
// The percentage that 4 is the first digit is: 12.5
// The percentage that 5 is the first digit is: 12.5
// The percentage that 6 is the first digit is: 12.5
// The percentage that 7 is the first digit is: 0.0
// The percentage that 8 is the first digit is: 0.0
// The percentage that 9 is the first digit is: 12.5