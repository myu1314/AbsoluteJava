/*
    Author: Mark Yu
    Last Updated: 11/14/2023
    Description:  Pig
  
  
*/

import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random  randomGenerator = new Random();
    Scanner keyboard = new Scanner(System.in); 
    int player1Total = 0;
    int computerTotal = 0;
    int turn = 1;
    int dieNumber = 0;
    String readyToRoll = "";
    String holdString = "";
    int repeatTurn = 1; // 0 = off, 1 = on
    int totalToAdd;
    
    while (player1Total <= 100 && computerTotal <= 100){
      randomGenerator = new Random(System.currentTimeMillis());
      if (turn == 1){
        repeatTurn = 1;
        while (repeatTurn == 1){
          totalToAdd = 0;
          System.out.println("It is player one's turn. Please enter 'r' when you are ready to roll");
          if (readyToRoll.equals("r")){
            dieNumber = randomGenerator.nextInt(5)+1;
            totalToAdd += dieNumber;
            if (dieNumber == 1){
              turn = 2;
              repeatTurn = 0;
            }
            else{
              System.err.println("Would you like to hold? (h)");
              if (holdString.equals("h")){
                repeatTurn = 0;
                player1Total += totalToAdd;
              }
              else{
                repeatTurn = 1;
              }
            }
         }
        }
      }
    }
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