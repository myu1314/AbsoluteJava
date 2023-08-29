/*
    Author: Mark Yu
    Last Updated: 8/25/2023
    Description: Calculates the amount of gumballs and candybars you get for a certain amount of coupons. 
  
  
*/
public class Ch01ProgrammingProject02 {
    public static void main(String[] args) {
        final double couponsPerCandy = 10;
        final double couponsPerGum = 3;

        double coupuns = 35;
        double candyBarCount;
        double gumCount;
        double reaminingCoupons;
        candyBarCount = Math.floor(coupuns/couponsPerCandy);
        gumCount = Math.floor((coupuns - candyBarCount * couponsPerCandy)/couponsPerGum);
        reaminingCoupons = coupuns - candyBarCount * couponsPerCandy - gumCount * couponsPerGum;


        System.out.println("With " + coupuns + " coupons you can get " + candyBarCount + " candy bars and " + gumCount + " gumballs. You will still have " + reaminingCoupons + " remaining coupons.");
            
    }
}

/*
 * ****************************OUTPUT**************************************
 * With 35.0 coupons you can get 3.0 candy bars and 1.0 gumballs. You will still have 2.0 remaining coupons.
 */