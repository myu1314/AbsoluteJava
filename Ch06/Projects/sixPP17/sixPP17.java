import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class sixPP16 {

  public static void main(String[] args) throws Exception {
    Scanner fileIn = null;
    int count[] = new int[10];
    double numbers = 0;
    double total = 0;
    double percentage = 0;
    int digit = 0;
    double numberOfDigits = 0;
    int totalNumberOfEntries = 0;
    // int letter1;
    // int letter2;
    try {
      fileIn = new Scanner(new FileInputStream("Ch06\\rsc\\ch6_PP16.csv"));
      while (fileIn.hasNextLine()) {
        numberOfDigits = 0;
        numbers = fileIn.nextInt();
        while (numbers/(Math.pow(10,numberOfDigits)) >= 1){
          numberOfDigits +=1;
        }
        digit = (int)(numbers/Math.pow(10,numberOfDigits-1));
        count[digit] += 1;
        totalNumberOfEntries += 1;
      }

      total = totalNumberOfEntries * 1.00;
      for (int i = 0; i < 10; i++){
        percentage = count[i]/(total) * 100;
        System.out.println("The percentage that " + i + " is the first digit is: " + percentage );
      }
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