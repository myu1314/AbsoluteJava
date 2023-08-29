/*
    Author: Mark Yu
    Last Updated: 8/25/2023
    Description: Calculates the amount of calories burned in 
  
  
*/
public class Ch01ProgrammingProject02 {
    public static void main(String[] args) {
        final double couponsPerCandy = 3;
        final double couponsPerGum = 10;

        double coupuns = 103;
        double candyBarCount;
        double gumCount;
        double reaminingCoupons;
        candyBarCount = Math.floor(coupuns/couponsPerCandy);
        gumCount = (coupuns - candyBarCount * couponsPerCandy)/couponsPerGum;
        reaminingCoupons = coupuns - candyBarCount * couponsPerCandy - gumCount * couponsPerGum;


        System.out.println("With " + coupuns + " coupons you can get " + gumCount + " gumballs and " + candyBarCount + " candy bars. You will still have " + reaminingCoupons + " reaming coupons");
            
    }
}

/*
 * ****************************OUTPUT**************************************
 * The total amount of calories burned is 1073.8636363636365.
 */