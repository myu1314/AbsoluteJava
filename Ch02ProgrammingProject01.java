/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description:  Sqrt
  
  
*/

import java.util.Scanner;

public class Ch02ProgrammingProject01 {
    public static void main(String[] args) throws Exception {
        System.out.println("What is the number that you want to be square rooted?");
        Scanner keyboard = new Scanner(System.in);
        double n = keyboard.nextDouble();
        double guess = n / 2;
        double r;
        r = n / guess;
        guess = (guess + r) / 2;
        r = n / guess;
        guess = (guess + r) / 2;
        r = n / guess;
        guess = (guess + r) / 2;
        r = n / guess;
        guess = (guess + r) / 2;
        r = n / guess;
        guess = (guess + r) / 2;
        
        System.out.printf("The square root of the number is aproximitly %.2f", guess);

    }
}
/*
 * ****************************OUTPUT**************************************
 * What is the number that you want to be square rooted? 4
 * The square root of the number is aproximitly 2.00
 */