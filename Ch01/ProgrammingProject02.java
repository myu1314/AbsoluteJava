/*
    Author: Mark Yu and Mr. Simon
    Last Updated: 8/25/2023
    Description: Calculates the amount of gumballs and candybars you get for a certain amount of coupons. 
  
  
*/
public class ProgrammingProject02 {
    public static void main(String[] args) {
        final double COUPONS_PER_CANDY = 10;
        final double COUPUNS_PER_GUM = 3;

        double coupuns = 35;
        double candyBarCount;
        double gumCount;
        double reaminingCoupons;
        candyBarCount = Math.floor(coupuns/COUPONS_PER_CANDY);
        gumCount = Math.floor((coupuns % COUPONS_PER_CANDY)/COUPUNS_PER_GUM);
        reaminingCoupons = coupuns - candyBarCount * COUPONS_PER_CANDY - gumCount * COUPUNS_PER_GUM;


        System.out.println("With " + coupuns + " coupons you can get " + candyBarCount + " candy bars and " + gumCount + " gumballs. You will still have " + reaminingCoupons + " remaining coupons.");
            
    }
}

/*
 * ****************************OUTPUT**************************************
 * With 35.0 coupons you can get 3.0 candy bars and 1.0 gumballs. You will still have 2.0 remaining coupons.
 */
