import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class sixPP13 {

    public static void main(String[] args) {
        int playerPoints = 0;
        Scanner keyboard = new Scanner(System.in);
        String questions[] = { "Leonardo da Vinci's Mona Lisa hangs in what museum?",
                "What is the name of John Travolta's character in the 1977 film Saturday Night Fever?",
                "Relative to the internet, what does URL stand for? ",
                "What sport was featured on the first curved U.S. coin in 2014?",
                "What occasion corresponds with the longest day of the year? " };
        String answers[] = { "The Louvre", "Tony Manero", "Uniform resource locator", "Baseball",
                "The Summer Solstice" };
        int points[] = { 5, 4, 3, 2, 1 };

        Trivia q1 = new Trivia(questions[0], answers[0], points[0]);
        Trivia q2 = new Trivia(questions[1], answers[1], points[1]);
        Trivia q3 = new Trivia(questions[2], answers[2], points[2]);
        Trivia q4 = new Trivia(questions[3], answers[3], points[3]);
        Trivia q5 = new Trivia(questions[4], answers[4], points[4]);

        if(q1.check()){
            playerPoints += q1.getPoints(); 
        }
        if(q2.check()){
            playerPoints += q2.getPoints(); 
        }
        if(q3.check()){
            playerPoints += q3.getPoints(); 
        }
        if(q4.check()){
            playerPoints += q4.getPoints(); 
        }
        if(q5.check()){
            playerPoints += q5.getPoints(); 
        }
    System.out.println("Total points: " + playerPoints);
    }
    
}