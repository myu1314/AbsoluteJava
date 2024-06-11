import java.util.Random;
import java.util.Scanner;

public class sixPP02 {

    private static final int ROWNUMBER = 4;
    private static final int COLUMNNUMBER = 4;
    private static final int CARDCOUNT = 16;



    // This function is used to find the number at the x and y coordinate.
    public static int findNum(int xPos, int yPos, int[][] table) {
        return table[xPos][yPos];
    }

    // Generating a table
    public static int[][] generateTable() {
        int[] cards = new int[CARDCOUNT];
        int[][] table = new int[ROWNUMBER][COLUMNNUMBER];
        int pos = 0;

        // This for loop is to create 16 unshuffled cards
        for (int i = 0; i <= (CARDCOUNT) / 2 - 1; i++) {
            cards[pos] = i + 1;
            cards[pos + 1] = i + 1;
            pos += 2;
        }

        // This shuffles the cards
        Random rand = new Random();
        int pos1, pos2, transition;
        for (int i = 0; i <= CARDCOUNT; i++) {
            pos1 = rand.nextInt(CARDCOUNT);
            pos2 = rand.nextInt(CARDCOUNT);
            transition = cards[pos1];
            cards[pos1] = cards[pos2];
            cards[pos2] = transition;
        }

        // This block of code is to make sure that one 8 is at coordinate 0,0.
        int eight1pos = -1;
        int givenPos = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 8) {
                eight1pos = i;
                break;
            }
        }
        if (eight1pos != -1) {
            transition = cards[eight1pos];
            cards[eight1pos] = cards[givenPos];
            cards[givenPos] = transition;
        }

        // This block of code is to make sure that one 8 is at coordinate 2,3.
        givenPos = ROWNUMBER * 2 + 1;
        eight1pos = -1;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 8) {
                eight1pos = i;
                break;
            }
        }
        if (eight1pos != -1) {
            transition = cards[eight1pos];
            cards[eight1pos] = cards[givenPos];
            cards[givenPos] = transition;
        }

        // Assigning the shuffled cards to the table
        for (int i = 0; i < ROWNUMBER; i++) {
            for (int j = 0; j < COLUMNNUMBER; j++) {
                table[i][j] = cards[i * 4 + j];
            }
        }
        return table;
    }

    // This function prints a table when given an array
    public static void printTable(int[][] table) {
        System.out.println("\n");
        System.out.println("   1 2 3 4");
        System.out.println("  ----------");
        for (int i = 0; i < ROWNUMBER; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < COLUMNNUMBER; j++) {
                int answer = findNum(i, j, table);
                if (answer != 0) {
                    System.out.print(answer + " ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    // Asking for user input for coords
    public static int askForInput(String askPos) {
        Scanner scanner = new Scanner(System.in);
        int pos = -1;
        while (pos == -1) {
            System.out.print(askPos + "Pos: ");
            if (scanner.hasNextInt()) {
                pos = scanner.nextInt();
                if (pos < 1 || pos > 4) {
                    pos = -1;
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // clear invalid input
            }
        }
        return pos - 1;
    }

    // Checks if the playingTable is full
    public static boolean isGameOver(int[][] playingTable) {
        for (int i = 0; i < ROWNUMBER; i++) {
            for (int j = 0; j < COLUMNNUMBER; j++) {
                if (playingTable[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Running the game
    public static void gameCycle(int[][] playingTable, int[][] answerTable) {
        boolean gameStillOn = true;
        int turnCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (gameStillOn) {
            turnCount++;
            int num1Xpos = askForInput("x");
            int num1Ypos = askForInput("y");
            int num2Xpos = askForInput("x");
            int num2Ypos = askForInput("y");

            if (num1Xpos == num2Xpos && num1Ypos == num2Ypos) {
                System.out.println("Please don't input the same coordinates");
            } else {
                int num1 = findNum(num1Ypos, num1Xpos, answerTable);
                int num2 = findNum(num2Ypos, num2Xpos, answerTable);
                if (num1 == num2) {
                    playingTable[num1Ypos][num1Xpos] = num1;
                    playingTable[num2Ypos][num2Xpos] = num2;
                    System.out.println("(" + (num1Xpos + 1) + "," + (num1Ypos + 1) + ")"
                            + " and "
                            + "(" + (num2Xpos + 1) + "," + (num2Ypos + 1) + ")"
                            + " do contain the same number.");
                } else {
                    System.out.println("(" + (num1Xpos + 1) + "," + (num1Ypos + 1) + ")"
                            + " and "
                            + "(" + (num2Xpos + 1) + "," + (num2Ypos + 1) + ")"
                            + " don't contain the same number.");
                }
                gameStillOn = !isGameOver(playingTable);
            }
            printTable(playingTable);
        }
        System.out.println("Great Job!!!!");
    }

    // Creating an empty playing table
    public static int[][] creatingPlayingTable(int length, int width) {
        int[][] table = new int[ROWNUMBER][COLUMNNUMBER];
        for (int i = 0; i < ROWNUMBER; i++) {
            for (int j = 0; j < COLUMNNUMBER; j++) {
                table[i][j] = 0;
            }
        }
        return table;
    }

    // Starting Game
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int[][] answerTable = generateTable();
        int[][] playingTable = creatingPlayingTable(4, 4);
        
        System.out.println("Are you ready to start? (press any key to start)");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase(userInput)){
            System.out.flush();
            System.out.println("Here is the answer table:");
            printTable(answerTable);
            System.out.println("\nThe game will begin in:\n");
            for(int i = 5; i >= 1; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            for(int i = 0; i <= 7; i++){
                System.out.println("\n");
            }
            printTable(playingTable);
            gameCycle(playingTable, answerTable);    
        }
    }
}