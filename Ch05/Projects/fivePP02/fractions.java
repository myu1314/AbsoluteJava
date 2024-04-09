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
        while (fraction2)
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

    
    
    public void trackSalesStatus() {
        System.out.println("Total Number of Book's Sold:" + totalBooksSold + ".");
    }
    public void displayQuantityAvailable() {
        System.out.println("Quantity available for Book " + storeId + " is " + quantity + ".");
    }
    public void sellBook(int sellingQuantity) {
        if (quantity >= sellingQuantity){
            totalBooksSold  += sellingQuantity;
            quantity = quantity - sellingQuantity;
        }
        else{
            System.out.println("Not enough books");
        }
    }
    
}

