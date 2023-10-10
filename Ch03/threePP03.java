/*
    Author: Mark Yu
    Last Updated: 10/9/2023
    Description:  Calculates weight based on planet
  
  
*/

import java.util.Scanner;

public class threePP03 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String result = "y";
        while(result.equals("y")){
            System.out.println("Are you on the Earth or Moon (e/m):");
            String place = keyboard.nextLine();
            System.out.println("Weight of the object in kg: ");
            double weightInKg =  keyboard.nextDouble();
            double weightInNewtons;
            weightInNewtons = weightInKg * 9.81;
            if (place.equals("m")){
                weightInNewtons /= 6;
            }
            System.out.printf("The weight of the object in Newtons is: %2.2f \n", weightInNewtons);
            System.out.println("Would you like to reuse the program (y/n)");
            keyboard.nextLine();
            result = keyboard.nextLine();
        }
        keyboard.close();
        
    }

}
/*
 * ****************************OUTPUT**************************************
 * Are you on the Earth or Moon (e/m):
 * e
 * Weight of the object in kg: 
 * 20
 * The weight of the object in Newtons is: 196.20 
 * Would you like to reuse the program (y/n)
 * y
 * Are you on the Earth or Moon (e/m):
 * m 
 * Weight of the object in kg: 
 * 10
 * The weight of the object in Newtons is: 16.35 
 * Would you like to reuse the program (y/n)
 * n
 */