import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
    @SuppressWarnings("resource")
    public String playerName;
    public int playerHighScore;

    public Player(){
        this.playerName = "Unnamed";
        this.playerHighScore = 0;
    }
    public Player(String intPlayerName){
        this.playerName = intPlayerName;
        this.playerHighScore = 0;
    }
    public Player(String intPlayerName, int intPlayerHighScore){
        this.playerName = intPlayerName;
        this.playerHighScore = intPlayerHighScore;
    }
    
    public void print() {
        System.out.println(playerName + ": " + playerHighScore);
    }
    public String getName(){
        return playerName;
    }
    public int getScore(){
        return playerHighScore;
    }
    public void setName(String name) {
        this.playerName = name;
    }
    public void setScore(int points) {
        this.playerHighScore = points;
    }
    
}
