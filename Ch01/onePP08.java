/*
    Author: Mark Yu
    Last Updated: 9/4/2023
    Description: Finds Pace
  
  
*/
public class onePP08 {
    public static final double distance = 6.21;
    public static void main(String[] args) throws Exception {
        System.out.println("This program caculates your pace given a time and distance traveled.");
        double TIME; 
        double PACE; 
        TIME = 35.5; /* 35 minutes and 30 seconds */
        PACE = TIME / distance; 
        System.out.println("Your pace is " + PACE + "miles per hour.");
        
    }
}
/*
 * ****************************OUTPUT**************************************
 * Your pace is 5.71658615136876miles per hour.
 */