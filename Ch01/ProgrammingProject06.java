/*
    Author: Mark Yu
    Last Updated: 9/4/2023
    Description: Calculates Bike speed
  
  
*/
public class Ch01ProgrammingProject06 {
    public static void main(String[] args) throws Exception {
        double cadance = 90;
        double gearSize = 100;
        double speed = gearSize *  Math.PI * 1/12 * 1/5280 * cadance * 60;
        System.out.println("The speed is: " + speed + "mph.");

    }
}
/*
 * ****************************OUTPUT**************************************
 * The speed is: 26.77493738854938mph.
 */