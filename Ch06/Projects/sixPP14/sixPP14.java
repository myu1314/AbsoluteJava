import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class sixPP14 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin[] = { 6, 9, 4, 2, 0 };
        int userInputInt = 0;
        int userInput[] = new int[pin.length];
        Random random = new Random();
        int regularNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int translationSetNumber[] = new int[10];
        for (int i = 0; i < 10; i++) {
            translationSetNumber[i] = random.nextInt(3) + 1;
        }
        System.out.print("[");
        for (int i = 0; i < 9; i++) {
            System.out.print(regularNumber[i] + ", ");
        }
        System.out.print(regularNumber[regularNumber.length - 1]);
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < 9; i++) {
            System.out.print(translationSetNumber[i] + ", ");
        }
        System.out.print(translationSetNumber[translationSetNumber.length - 1]);
        System.out.println("]");
        for(int i = 0; i < pin.length; i++){
            System.out.println((i+1) + " number of passcode: ");
            userInputInt = keyboard.nextInt();
            userInput[i] = userInputInt;
        }
        
        if(validatePin(userInput,pin,regularNumber,translationSetNumber)){
            System.out.println("Correct Pin.");
        }
        else{
            System.out.println("Incorrect Pin");
        }

    }

    public static boolean validatePin(int userInput[], int pin[], int regularNumber[], int translationSetNumber[]) {
        boolean result = true;
        for(int i = 0; i < userInput.length; i++){
            for (int repeatingPin = 0; repeatingPin < pin.length; repeatingPin++) {
                if (regularNumber[repeatingPin] == pin[i]) {
                    if (translationSetNumber[repeatingPin] != userInput[i]) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}