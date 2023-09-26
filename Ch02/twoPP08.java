/*
    Author: Mark Yu
    Last Updated: 9/18/2023
    Description: Upper Case and Lower case
  
  
*/

import java.util.Scanner;

public class twoPP08{
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Phrase?");
        String phrase = keyboard.nextLine();
        String phraseU = phrase.toUpperCase();
        String phraseL = phrase.toLowerCase();
        System.out.println("Capitilized, your phrase is:" + phraseU);
        System.out.println("Compltely Lowercased, your phrase is:" + phraseL);
        keyboard.close();
    }
}
/*
 * ****************************OUTPUT**************************************
 * Phrase?
 * I hate you
 * Capitilized, your phrase is:I HATE YOU
 * Compltely Lowercased, your phrase is:i hate you
 */