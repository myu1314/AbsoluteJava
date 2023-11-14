/*
    Author: Mark Yu
    Last Updated: 11/7/2023
    Description:  Coding Numbers
  
  
*/

import java.util.Scanner;
import java.lang.Math;

public class threePP08 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int phrase;
        String result;
        int numOfLetters;
        String repeatOffender = "y";
        int numToCheck;
        while (repeatOffender.equals("y")) {
            System.out.println("Phrase: ");
            numOfLetters = 1;
            phrase = keyboard.nextInt();
            result = "";
            while (phrase / Math.pow(10, numOfLetters) >= 1) {
                    numOfLetters += 1;

            }
            for(int i = 1; i <= numOfLetters; i++){
                numToCheck = findDigit(i, phrase, numOfLetters);
                if((i == numOfLetters || i == 1) && isOddOrEven(findDigit(i, phrase,numOfLetters)).equals("even") && isOddOrEven(findDigit(numOfLetters, phrase, numOfLetters)).equals("even")){
                    result += "$";
                }
                else if((i == numOfLetters || i == 1) && isOddOrEven(findDigit(i, phrase,numOfLetters)).equals("odd") && isOddOrEven(findDigit(numOfLetters, phrase, numOfLetters)).equals("odd")){
                    result += "X";
                }
                else if(numToCheck == 0 && i == numOfLetters){
                    result += "#";
                }
                else if(numToCheck == 0){
                    result += "0";
                }
                else if(numToCheck == 1){
                    result += "B";
                }
                else if(numToCheck == 2){
                    result += "E";
                }
                else if(numToCheck == 3){
                    result += "A";
                }
                else if(numToCheck == 4){
                    result += "@";
                }
                else if(numToCheck == 5){
                    result += "F";
                }
                else if(numToCheck == 6){
                    result += "K";
                }
                else if(numToCheck == 7){
                    result += "%";
                }
                else if(numToCheck == 8){
                    result += "R";
                }
                else if(numToCheck == 9){
                    result += "M";
                }
                
            }
            System.out.println(result);     
            System.out.println("Would you like to repeat the program?(y/n)");
            keyboard.nextLine();
            repeatOffender = keyboard.nextLine();
        }
        keyboard.close();

    }
    static int findDigit(int i, int phrase, int numOfLetters){
        int num = phrase/((int)Math.pow(10, numOfLetters-i)) % (int)Math.pow(10, 1);
        return num;
        
    }
    static String isOddOrEven(int num){
        String answer = " ";
        if (num%2 == 0 && num!=0){
            answer =  "even";
        }
        else if (num%2 == 1){
            answer = "odd";
        }
        return answer;
        
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