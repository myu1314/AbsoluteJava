/*
    Author: Mark Yu
    Last Updated: 9/4/2023
    Description: Finds Ideal Weight
  
  
*/
public class onePP09 {
    public static int MIN_HEIGHT = 5;
    public static int MIN_WEIGHT = 110; 
    public static int POUNDS_PER_INCH = 5;
    public static int CONVERSION_FT_TO_IN = 12;
    public static void main(String[] args) throws Exception {
        int heightFt = 6;
        int heightIn = 3; 
        int weight =  ((heightFt * CONVERSION_FT_TO_IN + heightIn) - MIN_HEIGHT * CONVERSION_FT_TO_IN) * POUNDS_PER_INCH + MIN_WEIGHT; 
        System.out.println("This is your ideal body weight: " + weight + " pounds.");
    }
}
/*
 * ****************************OUTPUT**************************************
 * This is your ideal body weight: 185 pounds.
 */