import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sixPP21 {
    @SuppressWarnings("resource")
    public static Player playerList[] = new Player[10];


    public static void main(String[] args) throws Exception {
        Player playerNew = new Player();
        for(int i = 0; i < 10; i++){
            playerList[i] = playerNew;
            playerList[i].print();
        }
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
        // for (int i = 0; i < 10; i++) {
        //     if (playerList[i].getName().equalsIgnoreCase("Unnamed")) {
        //         placeToAdd = i;
        //         break;
        //     }
        // }
        for (int i = 0; i < 10; i++) {
            playerList[i].print();
        }
    }

    public static void findPlayerScore(String name) {
        int playerScore = -1;
        for (int i = 0; i < 10; i++) {
            if (name.equalsIgnoreCase(playerList[i].getName())) {
                playerScore = playerList[i].getScore();
                System.out.println(name + " has " + playerScore + " points");
            }
        }
        if (playerScore == -1) {
            System.out.println("The Player Doesn't Exist");
        }

    }

    public static void add(String Name, int Points) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (playerList[i].getName().equalsIgnoreCase("Unnamed")) {
                playerList[i].setName(Name);
                playerList[i].setScore(Points);
                System.out.println("Player Added Successfully");
                break;
            }
        }

    }

    public static void remove(String Name) {
        int placeToAdd = 0;
        for (int i = 0; i < 10; i++) {
            if (playerList[i] == null) {
                placeToAdd = i;
                break;
            }
        }
        for (int i = 0; i <= placeToAdd; i++) {
            playerList[i].setName(playerList[i + 1].getName());
            playerList[i].setScore(playerList[i + 1].getScore());
        }
        playerList[placeToAdd].setName("Unnamened");
        playerList[placeToAdd].setScore(0);

    }
}
