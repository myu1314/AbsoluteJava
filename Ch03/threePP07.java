/*
    Author: Mark Yu
    Last Updated: 10/13/2023
    Description:  Finding Armstrong Numbers
  
  
*/

import java.util.Scanner;
import java.lang.Math;

public class threePP07 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int numOfDigit;
        int checkNum;
        // int start;
        int start = 0; // for testing
        // int end;
        int end = 500;
        int num;
        int total = 0;
        String result = "y";
        while (result.equals("y")) {
            /*
             * System.out.println("Starting Number: ");
             * start = keyboard.nextInt();
             * System.out.println("Ending Number: ");
             * end = keyboard.nextInt();
             */
            checkNum = start;

            while (checkNum <= end) {
                total = 0;
                numOfDigit = 1;
                while (checkNum / Math.pow(10, numOfDigit) >= 1) {
                    numOfDigit += 1;

                }
                System.out.println("Num Of Digit: " + numOfDigit);
                System.out.println("Check Num: " + checkNum);

                for (int i = 1; i < numOfDigit; i++) {
                    num = checkNum/((int)Math.pow(10, numOfDigit-i)) % (int)Math.pow(10, i);
                    total += Math.pow(num, 3);
                }
                System.out.println(total);
                checkNum += 1;
            }

            System.out.println("Would you like to repeat the program?(y/n)");
            keyboard.nextLine();
            result = keyboard.nextLine();
        }
        keyboard.close();

    }

}
/*
 * ****************************OUTPUT**************************************
 * Days that simulation run:
 * 50
 * Day 0: 10
 * Day 5: 10
 * Day 10: 20
 * Day 15: 30
 * Day 20: 50
 * Day 25: 80
 * Day 30: 130
 * Day 35: 210
 * Day 40: 340
 * Day 45: 550
 * Day 50: 890
 * Day 55: 1440
 * On the final day there are 1440 green cruds.
 */