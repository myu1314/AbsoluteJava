/*
    Author: Mark Yu
    Last Updated: 9/26/2023
    Description: Ideal Body Weight (Inputs From File)
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class twoPP14P2 {
    public static int CONVERSION_G_TO_MG = 1000;
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        try
        {
        fileIn = new Scanner(new FileInputStream("Ch02\\rsc\\ch2_PP14.txt"));
        String nameOfDrink = fileIn.nextLine();
        int amountToKill = fileIn.nextInt(); 
        int solutionInDrink = fileIn.nextInt();
        int healthyAmountOfDrinks = amountToKill * CONVERSION_G_TO_MG/solutionInDrink;
        System.out.println("You can have: " + healthyAmountOfDrinks + " " + nameOfDrink + " drinks without dying.");

           
        }  
        
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");  
            
        }
    }
}

/*
 * ****************************OUTPUT**************************************
 * You can have: 2000 Coke drinks without dying.
 */