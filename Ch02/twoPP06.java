/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Diet Soda Death
  
  
*/

import java.util.Scanner;

public class twoPP06 {
    public static void main(String[] args) throws Exception {
        System.out.print("Amount to kill? ");
        Scanner keyboard = new Scanner(System.in);
        double ATK = keyboard.nextDouble();
        System.out.print("Mouse Weight? ");
        
        int MW =  keyboard.nextInt();
        System.out.print("Desired Weight? ");

        int DW = keyboard.nextInt();
        final double SIS = 0.001;
        double SDC = ((ATK * MW)/DW)/SIS;
        System.out.printf("The Amount of diet soda is  needed to kill you is %5.2f", SDC);

        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * Amount to kill? 10
 * Mouse Weight? 5
 * Desired Weight? 150
 * The Amount of diet soda is  needed to kill you is 333.33
 */