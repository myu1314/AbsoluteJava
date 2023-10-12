/*
    Author: Mark Yu
    Last Updated: 10/11/2023
    Description:  Debt Calculator
  
  
*/

import java.util.Scanner;

public class threePP05 {
    public static void main(String[] args) throws Exception {
        final double  INTEREST_RATE = 0.015;
        final double ORIGINAL_COST = 1000;
        final double MONTHLY_PAYMENT = 50;

        Scanner keyboard = new Scanner(System.in);
        double debtRemaning = ORIGINAL_COST;
        double interestMonthly;
        double debtReduction;
        double interestTotal = 0;
        int month = 0;
        
        while (debtRemaning >= 0){
            month += 1;
            interestMonthly = debtRemaning * INTEREST_RATE;
            interestTotal += interestMonthly;
            debtReduction = MONTHLY_PAYMENT - interestMonthly;
            debtRemaning -= debtReduction;
            System.out.println("Month " + month);
            System.out.printf("Amount Paid: $50 \n");
            System.out.printf("Amount Due from Interest: %2.2f \n", interestMonthly);
            System.out.printf("Debt Remaining %2.2f \n", debtRemaning);
        }
        System.out.printf("Total interest paid: %2.2f \n", interestTotal);
        keyboard.close();
    }
   

}
/*
 * ****************************OUTPUT**************************************
 * Month 1
 * Amount Paid: $50
 * Amount Due from Interest: 15.00
 * Debt Remaining 965.00 ...
 * 
 * Month 24
 * Amount Paid: $50
 * Amount Due from Interest: 197.83
 * Debt Remaining -2.17
 * Total interest paid: 197.83
 */