/*
    Author: Mark Yu
    Last Updated: 9/26/2023
    Description: Ideal Body Weight (Inputs From Screen)
  
  
*/
import java.util.Scanner;



public class twoPP14P1 {
    public static int CONVERSION_G_TO_MG = 1000;
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Drink Name?  ");
        String nameOfDrink = keyboard.nextLine();
        System.out.print("How much caffeine will kill you (in grams)? ");
        int amountToKill = keyboard.nextInt(); 
        System.out.print("How much caffeine is in your can/cup of " + nameOfDrink + " in millagrams? ");
        int solutionInDrink = keyboard.nextInt();
        int healthyAmountOfDrinks = amountToKill * CONVERSION_G_TO_MG/solutionInDrink;
        System.out.println("You can have " + healthyAmountOfDrinks + " " + nameOfDrink + " drinks without dying.");
        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * Drink Name?  Coke
 * How much caffeine will kill you (in grams)? 10
 * How much caffeine is in your can/cup of Coke in millagrams? 5
 * You can have 2000 Coke drinks without dying.
 */