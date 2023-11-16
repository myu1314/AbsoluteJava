/*
    Author: Mark Yu
    Last Updated: 11/16/2023
    Description:  Random Constant Generator
  
  
*/

import java.util.Random;

public class threePP11 {
  public static void main(String[] args) {
    Random randomGenerator = new Random();
    int player1 = 0;
    int player2 = 0;
    int player3 = 0;
    randomGenerator = new Random(System.currentTimeMillis());
    while (player1 == player2 || player2 == player3 || player1 == player3){
        player1 = randomGenerator.nextInt(30) + 1;
        player2 = randomGenerator.nextInt(30) + 1;
        player3 = randomGenerator.nextInt(30) + 1;
    };
    System.out.println("Contestant number " + player1 + ", " + player2 + ",and " + player3 + " have been selected");
  }
}
// ****************************OUTPUT**************************************
// Contestant number 23, 8,and 19 have been selected