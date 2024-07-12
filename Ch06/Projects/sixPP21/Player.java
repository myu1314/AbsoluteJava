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
    public Player(String intPlayerName){
        playerName = intPlayerName;
        playerHighScore = 0;
    }
    public Player(String intPlayerName, int intPlayerHighScore){
        playerName = intPlayerName;
        playerHighScore = intPlayerHighScore;
    }
    
    public static void print() {
        System.out.println(playerName + ": " + playerHighScore);
    }
    public String getName(){
        return playerName;
    }
    public int getScore(){
        return playerHighScore;
    }
    public void setName(String name) {
        playerName = name;
    }
    public void setScore(int points) {
        playerHighScore = points;
    }
    public boolean isNull(){
        boolean result = false;
        if(playerName == null){
            result = true;
        }
        return result;
    }
    
}
