/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Pig Latin
  
  
*/

import java.util.Scanner;

public class ProgrammingProject06 {
    public static void main(String[] args) throws Exception {
        System.out.print("Amount to kill? ");
        Scanner ATKPrompt = new Scanner(System.in);
        double ATK = ATKPrompt.nextDouble();
        System.out.print("Mouse Weight? ");
        Scanner MWPrompt = new Scanner(System.in);
        int MW =  MWPrompt.nextInt();
        System.out.print("Desired Weight? ");
        Scanner DWPrompt = new Scanner(System.in); 
        int DW = DWPrompt.nextInt();
        final double SIS = 0.001;
        double SDC = ((ATK * MW)/DW)/SIS;
        System.out.printf("The Amount of diet soda is  needed to kill you is %5.2f", SDC);
    }
}
/*
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */