import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sixPP20 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {

        String word = "swimming";
        String wordToCheck;
        char lettersInWord[] = word.toCharArray();
        char lettersInWordCheck[];
        try {
            Scanner fileIn = null;
            boolean result = false;
            fileIn = new Scanner(new FileInputStream("Ch06\\rsc\\ch6_PP19.txt"));
            while (fileIn.hasNextLine()) {
                wordToCheck = fileIn.nextLine();
                lettersInWordCheck = wordToCheck.toCharArray();
                for (char letter : lettersInWordCheck) {
                    result = false;
                    for (char letterToCheck : lettersInWord) {
                        if (letter == letterToCheck) {
                            result = true;
                        }
                    }
                    if (result == false) {
                        break;
                    }
                }
                System.out.println("The words that work are: ");
                if (result == true) {
                    System.out.print(wordToCheck + " ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");

        }

    }
}
