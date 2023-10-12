/*
    Author: Mark Yu
    Last Updated: 8/26/2023
    Description: The amount of soda in a day that takes to kill a mouse. 
  
  
*/
public class onePP04 {
    public static void main(String[] args) throws Exception {
        final double AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE = .08; 
        final double MOUSE_WEIGHT = 30;

        final double DESIRED_WEIGHT = 150;
        final double FRACTION_OF_SWEETENER_TO_SODA = .001;

        System.out.println(
            "The amount of soda a day in grams is "+
            AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE*DESIRED_WEIGHT /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA) +
            " which is about " + 
            (AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE*DESIRED_WEIGHT /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA)) / 1000 +
            " liters a day"
            );
    }
}
/*
 * ****************************OUTPUT**************************************
 * The amount of soda a day in grams is 186666.6666666667 thats about 186 liters a day.
 */
