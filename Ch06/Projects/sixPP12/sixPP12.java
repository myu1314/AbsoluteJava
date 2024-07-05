import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class sixPP12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String questions[] = { "Leonardo da Vinci's Mona Lisa hangs in what museum?",
                "What is the name of John Travolta's character in the 1977 film Saturday Night Fever?",
                "Relative to the internet, what does URL stand for? ",
                "What sport was featured on the first curved U.S. coin in 2014?",
                "What occasion corresponds with the longest day of the year? " };
        String answers[] = { "The Louvre", "Tony Manero", "Uniform resource locator", "Baseball",
                "The Summer Solstice" };
        int points[] = { 5, 4, 3, 2, 1 };
        int playerPoints = 0;
        String playerAnswers;
        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            playerAnswers = keyboard.nextLine();
            if (answers[i].equalsIgnoreCase(playerAnswers)) {
                System.out.println("You are correct!");
                playerPoints += points[i];
            }
            else{
                System.out.println("Sorry, that is incorrect!");
            }
        }
        System.out.println("Total amount of Points:" +  playerPoints);

    }
}