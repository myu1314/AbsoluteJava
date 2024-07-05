import java.util.Scanner;

public class Trivia {
    String question;
    String answer;
    Scanner keyboard = new Scanner(System.in);
    int points;
    
    public Trivia(String inQuestion, String inAnswer, int inPoints){
        question = inQuestion;
        answer = inAnswer;
        points = inPoints;        
    }
    public boolean check(){
        String userAnswer;
        System.out.println(question);
        userAnswer = keyboard.nextLine();
        if(userAnswer.equalsIgnoreCase(answer)){
            System.out.println("You are correct");
            return true;
        }
        else{
            System.out.println("Incorrect Answer");
            return false;
        }

    }
    public int getPoints(){
        return points;
    }

}