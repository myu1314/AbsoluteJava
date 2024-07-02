import java.util.Scanner;

public class sixPP07 {
  
    private static final int maxDigits = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {

            System.out.print("Enter the first number (up to 20 digits): ");
            String num1 = scanner.nextLine();
     
            System.out.print("Enter the second number (up to 20 digits): ");
            String num2 = scanner.nextLine();

      
            if (num1.length() > maxDigits || num2.length() > maxDigits) {
                System.out.println("One of the numbers exceeds the maximum allowed length.");
                continue;
            }


            int[] number1 = new int[maxDigits];
            int[] number2 = new int[maxDigits];
            fillDigitArray(num1, number1);
            fillDigitArray(num2, number2);


            int[] result = new int[maxDigits + 1]; 
            addNumbers(number1, number2, result);


            if (result[maxDigits] != 0) {
                System.out.println("Integer overflow encountered.");
            } else {

                System.out.print("Sum: ");
                boolean leadingZero = true;
                for (int i = maxDigits - 1; i >= 0; i--) {
                    if (result[i] != 0) {
                        leadingZero = false;
                    }
                    if (leadingZero == false) {
                        System.out.print(result[i]);
                    }
                }
                if (leadingZero == true) {
                    System.out.print(0);
                }
                System.out.println();
            }

       
            System.out.print("Do you want to add more numbers? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                continueProgram = false;
            }
        }
    }

  
    private static void fillDigitArray(String number, int[] digitArray) {
        for (int i = 0; i < number.length(); i++) {
            digitArray[i] = number.charAt(number.length() - 1 - i) - 48;
        }
    }

    private static void addNumbers(int[] number1, int[] number2, int[] result) {
        int carry = 0;
        for (int i = 0; i < maxDigits; i++) {
            int sum = number1[i] + number2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        result[maxDigits] = carry;
    }
} 