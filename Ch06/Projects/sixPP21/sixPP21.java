import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sixPP20 {
    @SuppressWarnings("resource")
    public static String playerName[] = new String[10];
    public static int playerHighScore[] = new int[10];

    public static void main(String[] args) throws Exception {
        add("Micheal", 9);
        add("John", 10);
        add("William", 2);
        print();
        findPlayerScore("John");
        remove("Micheal");
        print();
    }

    public static void print() {
        int placeToAdd = 0;
        for (int i = 0; i < 10; i++) {
            if (playerName[i] == null) {
                placeToAdd = i;
                break;
            }
        }
        for (int i = 0; i < placeToAdd; i++) {
            System.out.println(playerName[i] + ": " + playerHighScore[i]);
        }
    }

    public static void findPlayerScore(String name) {
        int playerScore = -1;
        for (int i = 0; i < 10; i++) {
            if (name.equalsIgnoreCase(playerName[i])) {
                playerScore = playerHighScore[i];
                System.out.println(name + " has " + playerScore + " points");
            }
        }
        if (playerScore == -1) {
            System.out.println("The Player Doesn't Exist");
        }

    }

    public static void add(String Name, int Points) {
        for (int i = 0; i < 10; i++) {
            if (playerName[i] == null) {
                playerName[i] = Name;
                playerHighScore[i] = Points;
                System.out.println("Player Added Successfully");
                break;
            }
        }

    }

    public static void remove(String Name) {
        int placeToAdd = 0;
        for (int i = 0; i < 10; i++) {
            if (playerName[i] == null) {
                placeToAdd = i;
                break;
            }
        }
        for (int i = 0; i <= placeToAdd; i++) {
            playerName[i] = playerName[i + 1];
            playerHighScore[i] = playerHighScore[i + 1];

        }
        playerName[placeToAdd] = null;
        playerHighScore[placeToAdd] = 0;

    }
}
