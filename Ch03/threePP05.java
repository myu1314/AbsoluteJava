/*
    Author: Mark Yu
    Last Updated: 10/11/2023
    Description:  Debt Calculator
  
  
*/


public class threePP05 {
    public static void main(String[] args) throws Exception {
        final double  INTEREST_RATE = 0.015;
        final double ORIGINAL_COST = 1000;
        final double MONTHLY_PAYMENT = 50;
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
    }
   

}
/****************************OUTPUT**************************************
Month 1
Amount Paid: $50 
Amount Due from Interest: 15.00 
Debt Remaining 965.00 
Month 2
Amount Paid: $50 
Amount Due from Interest: 14.48 
Debt Remaining 929.48 
Month 3
Amount Paid: $50 
Amount Due from Interest: 13.94 
Debt Remaining 893.42 
Month 4
Amount Paid: $50 
Amount Due from Interest: 13.40 
Debt Remaining 856.82 
Month 5
Amount Paid: $50 
Amount Due from Interest: 12.85 
Debt Remaining 819.67
Month 6
Amount Paid: $50
Amount Due from Interest: 12.30
Debt Remaining 781.97
Month 7
Amount Paid: $50
Amount Due from Interest: 11.73
Debt Remaining 743.70
Month 8
Amount Paid: $50
Amount Due from Interest: 11.16
Debt Remaining 704.85
Month 9
Amount Paid: $50
Amount Due from Interest: 10.57
Debt Remaining 665.42
Month 10
Amount Paid: $50
Amount Due from Interest: 9.98
Debt Remaining 625.40
Month 11
Amount Paid: $50
Amount Due from Interest: 9.38
Debt Remaining 584.79
Month 12
Amount Paid: $50
Amount Due from Interest: 8.77
Debt Remaining 543.56
Month 13
Amount Paid: $50
Amount Due from Interest: 8.15
Debt Remaining 501.71
Month 14
Amount Paid: $50
Amount Due from Interest: 7.53
Debt Remaining 459.24
Month 15
Amount Paid: $50
Amount Due from Interest: 6.89
Debt Remaining 416.13
Month 16
Amount Paid: $50
Amount Due from Interest: 6.24
Debt Remaining 372.37
Month 17
Amount Paid: $50
Amount Due from Interest: 5.59
Debt Remaining 327.95
Month 18
Amount Paid: $50
Amount Due from Interest: 4.92
Debt Remaining 282.87
Month 19
Amount Paid: $50
Amount Due from Interest: 4.24
Debt Remaining 237.11
Month 20
Amount Paid: $50
Amount Due from Interest: 3.56
Debt Remaining 190.67
Month 21
Amount Paid: $50
Amount Due from Interest: 2.86
Debt Remaining 143.53
Month 22
Amount Paid: $50
Amount Due from Interest: 2.15
Debt Remaining 95.68
Month 23
Amount Paid: $50
Amount Due from Interest: 1.44
Debt Remaining 47.12
Month 24
Amount Paid: $50
Amount Due from Interest: 0.71
Debt Remaining -2.17
Total interest paid: 197.83
 */