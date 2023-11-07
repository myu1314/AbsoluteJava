/*
    Author: Mark Yu
    Last Updated: 11/7/2023
    Description:  Finding Armstrong Numbers
  
  
*/

import java.util.Scanner;
import java.lang.Math;

public class threePP07 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int numOfDigit;
        int checkNum;
        int start; 
        int end;
        int num;
        int total = 0;
        String result = "y";
        while (result.equals("y")) {
            
            System.out.println("Starting Number: ");
            start = keyboard.nextInt();
            System.out.println("Ending Number: ");
            end = keyboard.nextInt();
            checkNum = start;

            while (checkNum <= end) {
                total = 0;
                numOfDigit = 1;
                while (checkNum / Math.pow(10, numOfDigit) >= 1) {
                    numOfDigit += 1;

                }

                for (int i = 1; i <= numOfDigit; i++) {
                    num = checkNum/((int)Math.pow(10, numOfDigit-i)) % (int)Math.pow(10, 1);
                    total += Math.pow(num, 3);
                }
                if (total == checkNum){
                    System.out.println(total);
                }   
                checkNum += 1;
            }

            System.out.println("Would you like to repeat the program?(y/n)");
            keyboard.nextLine();
            result = keyboard.nextLine();
        }
        keyboard.close();

    }

}

//****************************OUTPUT**************************************
// Starting Number: 
// 1
// Ending Number:
// 200
// 1
// 153
// Would you like to repeat the program?(y/n)
// y
// Starting Number:
// 1
// Ending Number:
// 500
// 1
// 153
// 370
// 371
// 407
// Would you like to repeat the program?(y/n)
// n