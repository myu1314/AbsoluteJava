/*
    Author: Mark Yu
    Last Updated: 10/9/2023
    Description:  Allows for RGB strip to be created
  
  
*/

import java.util.Scanner;

public class threePP04 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double currentPrice;
        double futurePrice;
        double yearsFromNow;
        double purchaseAmount;
        double inflation;
        System.out.println("What is the current price:");
        currentPrice = keyboard.nextDouble();
        System.out.println("What is the inflation rate (as a percent):");
        inflation = keyboard.nextDouble();
        inflation = inflation/100;
        System.out.println("How many years in the future will it be: ");
        yearsFromNow = keyboard.nextDouble();
        for(int years = 0; years <= yearsFromNow; years++){
            currentPrice += currentPrice * inflation;
        }
        System.out.printf("The price %2.2f years into the future is: $%2.2f \n",yearsFromNow, currentPrice);
        keyboard.close();
    }
   

}
/*
 * ****************************OUTPUT**************************************
 * Letter for item 1:
 * R
 * Letter for item 2:
 * G
 * Letter for item 3:
 * B
 * Letter for item 4:
 * G
 * Letter for item 5:
 * R
 * The final pattern result is: RGBGR
 */