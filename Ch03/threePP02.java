/*
    Author: Mark Yu
    Last Updated: 9/27/2023
    Description:  Allows for RGB strip to be created
  
  
*/

import java.util.Scanner;

public class threePP02 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean valid;
        String l1;
        String l2;
        String l3;
        String l4;
        String l5;
        String finalString = "";

        // L1
        System.out.println("Letter for item 1: ");
        l1 = keyboard.nextLine();
        valid = check("S",l1);
        if (valid == true){
            finalString += l1;
        }
        else if(valid == false){
            System.out.println("Program doesn't accept");
            System.exit(0);
        }
        
        // L2
        System.out.println("Letter for item 2: ");
        l2 = keyboard.nextLine();
        valid = check(l1,l2);
        if (valid == true){
            finalString += l2;
        }
        else if(valid == false){
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        System.out.println(finalString);
       keyboard.close();
    }
     static boolean check(String previousletter,String letter ){
        boolean result;
        System.out.println(previousletter);
        System.out.println(letter);
        if(previousletter != letter ){
            System.out.println("noonon");
            if(letter == "R"){ // || letter == "B" || letter == "G"){
                System.out.println("noonon");
                result = true;
            }
            else{
                result = false;
            }           
        }
        else{
            result = false;
        }
        System.out.println(result);
        return result;
     };
}
/*
 * ****************************OUTPUT**************************************
 * What is the number that you want to be square rooted? 4
 * The square root of the number is aproximitly 2.00
 */