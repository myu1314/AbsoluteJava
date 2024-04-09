package Ch05.Projects.fivePP02;

public class fractions{
    public int numerator;
    public int denominator;
    private static int totalBooksSold = 0;
    public fractions(int inNumerator,int inDenominator){
        numerator = inNumerator;
        if (inDenominator > 0){
            denominator = inDenominator;
        }

    }
    public void setDenominator(int inDenominator){
        if (inDenominator > 0){
            denominator = inDenominator;
        }
    }
    public void setNumerator(int inNumerator){
            numerator = inNumerator;
    }
    public String displayFraction(){
        return (numerator + "/" + denominator);
    }
    public boolean equals(fractions fraction2){
        int gcd = gcd(numerator, denominator);
        int rNum = numerator/gcd;
        int rDenom = denominator/gcd;

        gcd = gcd(fraction2.numerator, fraction2.denominator);
        int otherRNum = fraction2.numerator/gcd;
        int otherRDenom = fraction2.denominator/gcd;

        return ((rNum == otherRNum) && (rDenom == otherRDenom));
    }
    public int gcd(int num, int denom){
        boolean found = false;
        int tryingNum = 0;
        while (found){
            if ((num % tryingNum != 0) && (denom % tryingNum != 0)){
                tryingNum += 1;
            }
            
        } 
        return tryingNum;
    }
}

