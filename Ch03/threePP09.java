/*
    Author: Mark Yu
    Last Updated: 11/14/2023
    Description:  Assingment Gradder
  
  
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); 
    int totalPoints = 0;
    int pointsScored = 0;
    int assingments = 0;
    double percent;
    System.out.println("How many assingments were there? ");
    assingments = keyboard.nextInt();
    for (int i = 1; i <= assingments; i++){
      System.out.println("Score recieved for exersise " + i);
      pointsScored+= keyboard.nextInt();
      System.out.println("Total points possible for exersie " + i);
      totalPoints+= keyboard.nextInt();
    };
    percent = pointsScored/(totalPoints * 1.0) * 100;
    System.out.printf("You scored %2d out of %2d points, or %% %2.2f", pointsScored,totalPoints, percent);
    keyboard.close();
  }
}
//****************************OUTPUT**************************************
// Phrase: 
// 487692
// $R%KM$
// Would you like to repeat the program?(y/n)
// y
// Phrase:
// 9492940
// M@MEM@0
// Would you like to repeat the program?(y/n)
// y
// Phrase:
// 9009
// $00$
// Would you like to repeat the program?(y/n)
// n