/*
    Author: Mark Yu
    Last Updated: 11/14/2023
    Description:  Assingment Gradder
  
  
*/

import java.util.Scanner;

public class threePP09 {
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
// How many assingments were there? 
// 3
// Score recieved for exersise 1
// 10
// Total points possible for exersie 1
// 10
// Score recieved for exersise 2
// 9
// Total points possible for exersie 2
// 10
// Score recieved for exersise 3
// 9
// Total points possible for exersie 3
// 10
// You scored 28 out of 30 points, or % 93.33