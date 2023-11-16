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
// Pig is a simple dice based two person game. If someone rolls a 1, they gain no points.
// If they roll a 2-6 they have the option to hold, or to roll again. In the next round,
// if a 1 is rolled, those points will also be lost. 
// Current Score
// Computer: 0
// Player: 0
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// h
// The computer rolls a 5
// The computer chooses to roll again
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 1
// Current Score
// Player: 12
// Computer: 0
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 6.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 2.
// Would you like to hold? (h)
// h
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 1
// Current Score
// Player: 24
// Computer: 0
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 2.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 1.
// Since you rolled a one, you don't gain any points
// The computer rolls a 5
// The computer chooses to roll again
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 1
// Current Score
// Player: 24
// Computer: 0
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 6.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 1.
// Since you rolled a one, you don't gain any points
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 5
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 3
// The computer chooses to hold
// Current Score
// Player: 24
// Computer: 21
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 1.
// Since you rolled a one, you don't gain any points
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to hold
// Current Score
// Computer: 45
// Player: 24
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 3.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// h
// The computer rolls a 1
// Current Score
// Computer: 45
// Player: 32
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// h
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 1
// Current Score
// Player: 46
// Computer: 45
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 2.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 3.
// Would you like to hold? (h)
// h
// The computer rolls a 3
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 4
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to hold
// Current Score
// Computer: 70
// Player: 55
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 6.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// h
// The computer rolls a 1
// Current Score
// Player: 74
// Computer: 70
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 4.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 6.
// Would you like to hold? (h)
// h
// The computer rolls a 2
// The computer chooses to roll again
// The computer rolls a 1
// Current Score
// Player: 89
// Computer: 70
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 3.
// Would you like to hold? (h)
// r
// It is player one's turn. Please enter 'r' when you are ready to roll
// r
// You rolled a 5.
// Would you like to hold? (h)
// h
// The computer rolls a 2
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 6
// The computer chooses to roll again
// The computer rolls a 2
// The computer chooses to roll again
// The computer rolls a 5
// The computer chooses to hold
// The player won by 11
// Have a great day!