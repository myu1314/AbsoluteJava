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
        valid = check("", l1);
        if (valid == true) {
            finalString += l1;
        } else if (valid == false) {
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        // L2
        System.out.println("Letter for item 2: ");
        l2 = keyboard.nextLine();
        valid = check(l1, l2);
        if (valid == true) {
            finalString += l2;
        } else if (valid == false) {
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        // L3
        System.out.println("Letter for item 3: ");
        l3 = keyboard.nextLine();
        valid = check(l2, l3);
        if (valid == true) {
            finalString += l3;
        } else if (valid == false) {
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        // L4
        System.out.println("Letter for item 4: ");
        l4 = keyboard.nextLine();
        valid = check(l3, l4);
        if (valid == true) {
            finalString += l4;
        } else if (valid == false) {
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        // L5
        System.out.println("Letter for item 5: ");
        l5 = keyboard.nextLine();
        valid = check(l4, l5);
        if (valid == true) {
            finalString += l5;
        } else if (valid == false) {
            System.out.println("Program doesn't accept");
            System.exit(0);
        }

        System.out.printf("The final pattern result is: %s", finalString);
        keyboard.close();
    }

    static boolean check(String previousletter, String letter) {
        boolean result;
        if (previousletter.equals(letter)) {
            result = false;
        } else {
            if (letter.equals("R") || letter.equals("B") || letter.equals("G")) { // ){
                result = true;
            } else {

                result = false;
            }

        }
        return result;
    }
}
/*
 * ****************************OUTPUT**************************************
 * Letter for item 1:  
 * R
 * Letter for item 2:
 * G
 * Letter for item 3:
 * B
 * Letter for item 4:
 * G
 * Letter for item 5:
 * R
 * The final pattern result is: RGBGR
 */