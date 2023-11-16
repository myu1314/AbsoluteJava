/*
    Author: Mark Yu
    Last Updated: 11/14/2023
    Description:  Pig
  
  
*/

import java.util.Scanner;
import java.util.Random;

public class threePP10 {
  public static void main(String[] args) {
    Random randomGenerator = new Random();
    Scanner keyboard = new Scanner(System.in);
    int player1Total = 0;
    int computerTotal = 0;
    int turn = 1;
    int dieNumber = 0;
    String readyToRoll = "";
    String holdString = "";
    int repeatTurn = 1; // 0 = off, 1 = on
    int totalToAdd;
    int pointsInOneTurn = 0;
    int winningDifference = 0;
    System.out.println("Pig is a simple dice based two person game. If someone rolls a 1, they gain no points.");
    System.out.println("If they roll a 2-6 they have the option to hold, or to roll again. In the next round,");
    System.out.println("if a 1 is rolled, those points will also be lost. ");
    while (player1Total <= 100 && computerTotal <= 100) {
      randomGenerator = new Random(System.currentTimeMillis());
      if (player1Total > computerTotal) {
        System.out.println("Current Score");
        System.out.println("Player: " + player1Total);
        System.out.println("Computer: " + computerTotal);
      } else {
        System.out.println("Current Score");
        System.out.println("Computer: " + computerTotal);
        System.out.println("Player: " + player1Total);
      }

      if (turn == 1) {
        repeatTurn = 1;
        totalToAdd = 0;
        while (repeatTurn == 1) {
          System.out.println("It is player one's turn. Please enter 'r' when you are ready to roll");
          readyToRoll = keyboard.nextLine();
          if (readyToRoll.equals("r")) {
            dieNumber = randomGenerator.nextInt(6) + 1;
            totalToAdd += dieNumber;
            System.out.println("You rolled a " + dieNumber + ".");
            if (dieNumber == 1) {
              System.out.println("Since you rolled a one, you don't gain any points");
              turn = 2;
              repeatTurn = 0;
            } else {
              System.out.println("Would you like to hold? (h)");
              holdString = keyboard.nextLine();
              if (holdString.equals("h")) {
                repeatTurn = 0;
                turn = 2;
                player1Total += totalToAdd;
              } else {
                repeatTurn = 1;
              }
            }
          }
        }
      }
      if (turn == 2) {
        pointsInOneTurn = 0;
        dieNumber = randomGenerator.nextInt(6) + 1;
        System.out.println("The computer rolls a " + dieNumber);
        if (dieNumber != 1) {
          pointsInOneTurn = dieNumber;
          totalToAdd = dieNumber;
          while (pointsInOneTurn <= 20 && dieNumber != 1) {
            System.out.println("The computer chooses to roll again");
            dieNumber = randomGenerator.nextInt(6) + 1;
            pointsInOneTurn += dieNumber;
            totalToAdd += dieNumber;
            System.out.println("The computer rolls a " + dieNumber);
          }     
          if (dieNumber != 1) {
            System.out.println("The computer chooses to hold");
            computerTotal += totalToAdd;
          }

          turn = 1;
        } else {
          turn = 1;
        }
      }

    }
    winningDifference = Math.abs(computerTotal - player1Total);
    if(computerTotal > player1Total){
       System.out.println("The computer won by " + winningDifference);
    }
    else if(computerTotal < player1Total){
       System.out.println("The player won by " + winningDifference);
    }
    else{
      System.out.println("It was a tie");
    }
    System.out.println("Have a great day!");
    keyboard.close();
  }
}
// ****************************OUTPUT**************************************
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