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
        Boolean isEqual = false;
        double other1 = (fraction2.numerator/fraction2.denominator);
        double current = (numerator/denominator);
        if (other1 == current){
            isEqual = true;
        }
        System.out.println("does it work");
        return isEqual;
        
    }
}

