/*
    Author: Mark Yu
    Last Updated: 9/6/2023
    Description: Finds the Change
  
  
*/

import java.util.Scanner;

public class twoPP07 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cost of item: ");
        double itemCost = keyboard.nextDouble();
        double returnAmount = 1.00 - itemCost;
        System.out.printf("%-30s\n","Recipt");
        System.out.printf("%-30s$%-30.2f \n","Cost:", itemCost);
        System.out.printf("%-30s%-30s\n","Amount Given:","$1.00");       
        System.out.printf("%-30s$%-30s\n","Change: ",returnAmount); 
        keyboard.close();
            
    }
}
/*
 * ****************************OUTPUT**************************************
 *  Cost of item: 0.30
    Recipt
    Cost:                         $0.30
    Amount Given:                 $1.00
    Change:                       $0.7
 */