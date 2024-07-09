import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
    @SuppressWarnings("resource")
    public static String playerName;
    public static int playerHighScore;

    public Player(){
        playerName = "Unnamed";
        playerHighScore = 0;
    }
    public Player(intPlayerName){
        playerName = intPlayerName;
        playerHighScore = 0;
    }

    public static void print() {
        System.out.println(playerName + ": " + playerHighScore);
    }
    public static void (){

    }

    
}
