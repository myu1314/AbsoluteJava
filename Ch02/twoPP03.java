/*
    Author: Mark Yu
    Last Updated: 9/26/2023
    Description: Division
  
  
*/

import java.util.Scanner;

public class twoPP03 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dividend: ");
        double dividend = keyboard.nextDouble();
        System.out.print("Divisor: ");
        double divisor = keyboard.nextDouble();


       
        double quotitent = Math.floor(dividend/divisor);
        double remainder = dividend%divisor;
        System.out.println("The quotitent is " + quotitent + " and the remainder is " + remainder + ".");
        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * Dividend: 10
 * Divisor: 3
 * The quotitent is 3.0 and the remainder is 1.0.
 */