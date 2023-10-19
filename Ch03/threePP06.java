/*
    Author: Mark Yu
    Last Updated: 10/13/2023
    Description:  Green Crud Calculator
  
  
*/

import java.util.Scanner;

public class threePP06 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final double STARTING_CRUD = 10;
        final double CRUD_GROWING_DAYS = 5;
        double currentCrud;
        double previousCrud;
        double daysOfSimulation= 0;
        double holder;
        double totalAmount;
        double daysThatHavePassed ;
        String result = "y";
        while (result.equals("y")) {
            currentCrud = STARTING_CRUD;
            previousCrud = 0;
            holder = 0;
            totalAmount = currentCrud;
            daysThatHavePassed = 0;
            System.out.println("Days that simulation run: ");
            daysOfSimulation = keyboard.nextDouble();
            System.out.printf("Day %2.0f: %2.0f \n", daysThatHavePassed, totalAmount);
            while ((daysOfSimulation-daysThatHavePassed)>=5) {
            // while (daysThatHavePassed < daysOfSimulation && (daysOfSimulation-daysThatHavePassed)>=5) {
                holder = currentCrud;
                totalAmount = currentCrud + previousCrud;
                previousCrud = holder;
                currentCrud = totalAmount;
                
                //daysOfSimulation -= 5;
                daysThatHavePassed += 5;
                System.out.printf("Day %2.0f: %2.0f \n", daysThatHavePassed, totalAmount);
                
            }
            System.out.printf("On the final day there are %2.0f green cruds\n", totalAmount);
            System.out.println("Would you like to repeat the program?(y/n)");
            keyboard.nextLine();
            result = keyboard.nextLine();
        }
        keyboard.close();
        
    }

}
/*
 * ****************************OUTPUT**************************************
 * Days that simulation run:
 * 50
 * Day 0: 10
 * Day 5: 10
 * Day 10: 20
 * Day 15: 30
 * Day 20: 50
 * Day 25: 80
 * Day 30: 130
 * Day 35: 210
 * Day 40: 340
 * Day 45: 550
 * Day 50: 890
 * Day 55: 1440
 * On the final day there are 1440 green cruds.
 */