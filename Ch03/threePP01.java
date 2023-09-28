/*
    Author: Mark Yu
    Last Updated: 9/27/2023
    Description:  UpgradedSqrt
  
  
*/

import java.util.Scanner;

public class threePP01 {
    public static void main(String[] args) throws Exception {
        System.out.println("What is the number that you want to be square rooted?");
        Scanner keyboard = new Scanner(System.in);
        double n = keyboard.nextDouble();
        double guess = n / 2;
        double previousGuess;
        double r;
        double percentage = 100;
        
        
        while(percentage >= 1){
            previousGuess = guess;
            r = n / guess;
            guess = (guess + r) / 2;
            percentage = (guess-previousGuess)/previousGuess * 100;
        }
        printf("The final answer is %0.2d. ", guess);
       keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * What is the number that you want to be square rooted? 4
 * The square root of the number is aproximitly 2.00
 */