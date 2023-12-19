import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Pp13
 */
public class threePP13MDSVersion {
    public static void main(String[] args) {
        String word = "radar";
        String longestPalindrome = "";
        Boolean palindromBoolean = false;

        try {
            Scanner file = new Scanner(new FileInputStream("Ch03\\rsc\\words.txt"));
            while (file.hasNextLine()) {
                word = file.nextLine();
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                        palindromBoolean = false;
                        break;
                    }
                    palindromBoolean = true;
                }
                if (palindromBoolean) {
                    if (longestPalindrome.length() < word.length()) {
                        longestPalindrome = word;
                    }
                    System.out.printf("%s is a palindrome!\n", word);
                } else {
                    // System.out.printf("%s is not a palindrome\n", word);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.printf("The longest palindrome is %s", longestPalindrome);
    }
}
// ****************************OUTPUT**************************************
// a is a palindrome!
// dad is a palindrome!
// eye is a palindrome!
// I is a palindrome!
// level is a palindrome!
// mom is a palindrome!
// pop is a palindrome!
// refer is a palindrome!
// The longest palindrome is level