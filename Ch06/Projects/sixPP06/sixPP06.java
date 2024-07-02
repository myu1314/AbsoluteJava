import java.util.Scanner;
import java.util.Arrays;

public class sixPP06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[50];
        int count = 0;

        System.out.println("Enter numbers (up to 50 entries). Type 'end' to stop:");

        while (count < 50) {
            if (scanner.hasNextInt()) {
                numbers[count++] = scanner.nextInt();
            } else if (scanner.hasNext() && scanner.next().equalsIgnoreCase("end")) {
                break;
            } else {
                System.out.println("Invalid input, please enter a number or 'end' to stop.");
            }
        }

        int[] inputArray = Arrays.copyOf(numbers, count);
        int[] uniqueElements = new int[count];
        int[] counts = new int[count];
        int uniqueCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueElements[j] == inputArray[i]) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueElements[uniqueCount] = inputArray[i];
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = 0; j < uniqueCount - i - 1; j++) {
                if (uniqueElements[j] < uniqueElements[j + 1]) {
                    int tempElement = uniqueElements[j];
                    uniqueElements[j] = uniqueElements[j + 1];
                    uniqueElements[j + 1] = tempElement;

                    int tempCount = counts[j];
                    counts[j] = counts[j + 1];
                    counts[j + 1] = tempCount;
                }
            }
        }
        System.out.println("N Count");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + " " + counts[i]);
        }
    }
}