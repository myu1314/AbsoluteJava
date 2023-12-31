/*
    Author: Mark Yu
    Last Updated: 9/18/2023
    Description: Grocery Thing
  
  
*/

import java.util.Scanner;

public class twoPP10 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        //Getting Information of Item 1
        System.out.print("Input the name of item 1. ");
        String item1NameLC = keyboard.nextLine();
        String item1NameFirstCharacter = item1NameLC.substring(0,1);
        item1NameFirstCharacter = item1NameFirstCharacter.toUpperCase();
        String item1NameOLS = item1NameLC.substring(1,item1NameLC.length());
        String item1NameResult = item1NameFirstCharacter + item1NameOLS;
        System.out.print("Input the quantity of Item 1. ");
        int item1Amount = keyboard.nextInt();
        System.out.print("Input the price of Item 1. ");
        double item1Price = keyboard.nextDouble();
        keyboard.nextLine(); 
        double item1TotalPrice = item1Amount * item1Price; 

        //Getting Information of Item 2
        System.out.print("Input the name of item 2. ");
        String item2NameLC = keyboard.nextLine();
        String item2NameFirstCharacter = item2NameLC.substring(0,1);
        item2NameFirstCharacter = item2NameFirstCharacter.toUpperCase();
        String item2NameOLS = item2NameLC.substring(1,item2NameLC.length());
        String item2NameResult = item2NameFirstCharacter + item2NameOLS;
        System.out.print("Input the quantity of Item 2. ");
        int item2Amount = keyboard.nextInt();
        System.out.print("Input the price of Item 2. ");
        double item2Price = keyboard.nextDouble();
        keyboard.nextLine();
        double item2TotalPrice = item2Amount * item2Price;

        //Getting Information of Item 3
        System.out.print("Input the name of item 3. ");
        String item3NameLC = keyboard.nextLine();
        String item3NameFirstCharacter = item3NameLC.substring(0,1);
        item3NameFirstCharacter = item3NameFirstCharacter.toUpperCase();
        String item3NameOLS = item3NameLC.substring(1,item3NameLC.length());
        String item3NameResult = item3NameFirstCharacter + item3NameOLS;
        System.out.print("Input the quantity of Item 3. ");
        int item3Amount = keyboard.nextInt();
        System.out.print("Input the price of Item 3. ");
        double item3Price = keyboard.nextDouble();
        keyboard.nextLine();
        double item3TotalPrice = item3Amount * item3Price; 

        // Calculating the total amount of money needed
        double subtotal = item1TotalPrice + item2TotalPrice + item3TotalPrice;
        double salesTax = subtotal * 0.0625;
        double Total = subtotal + salesTax; 

        //Outputing the final calculations in a list format
        String heading1 = "Item";
        String heading2 = "Quantity";
        String heading3 = "Price";
        String heading4 = "Total";


        System.out.println("Your Bill:");
        System.out.println("===========================================================");
        System.out.printf("%-30s%-10s|%-10s%-10s\n",heading1,heading2,heading3,heading4);
        System.out.printf("%-30s%-10d|$%-10.2f$%-10.2f \n",item1NameResult,item1Amount,item1Price,item1TotalPrice);
        System.out.printf("%-30s%-10d|$%-10.2f$%-10.2f \n",item2NameResult,item2Amount,item2Price,item2TotalPrice);
        System.out.printf("%-30s%-10d|$%-10.2f$%-10.2f \n",item3NameResult,item3Amount,item3Price,item3TotalPrice);
        System.out.printf("%-50s$%-10.2f\n","Subtotal", subtotal);
        System.out.printf("%-50s$%10.2f\n","6.25% Sales Tax",salesTax);
        System.out.printf("%-50s$%10.2f\n","Total",Total);
        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * Input the name of item 1. Peanuts
 * Input the quantity of Item 1. 3
 * Input the price of Item 1. 2
 * Input the name of item 2. Eggs
 * Input the quantity of Item 2. 5
 * Input the price of Item 2. 1
 * Input the name of item 3. Strawberries
 * Input the quantity of Item 3. 1
 * Input the price of Item 3. 6
 * Your Bill:
 * ===========================================================
 * Item                          Quantity  |Price     Total
 * Peanuts                       3         |$2.00      $6.00
 * Eggs                          5         |$1.00      $5.00
 * Strawberries                  1         |$6.00      $6.00       
 * Subtotal                                          $17.00
 * 6.25% Sales Tax                                   $      1.06
 * Total                                             $     18.06
*/