import java.util.Scanner;
import java.util.Random;


public class sixPP10 {
    public static int cordX;  
    public static int cordY; 
    public static int BOARD_DIMENSION_X = 5;
    public static int BOARD_DIMENSION_Y = 5;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String movement;
        Random random = new Random();
        cordX = random.nextInt(BOARD_DIMENSION_X);
        cordY = random.nextInt(BOARD_DIMENSION_Y);
        
        String gameboard[][] = new String[BOARD_DIMENSION_X][BOARD_DIMENSION_Y];
        for (int row = 0; row < BOARD_DIMENSION_X; row++) {
            for (int column = 0; column < BOARD_DIMENSION_Y; column++) {
                gameboard[row][column] = "*";
            }
        }
        gameboard[cordY][cordX] = "N";
        
        while (true) {
            for (int row = 0; row < BOARD_DIMENSION_X; row++) {
                for (int column = 0; column < BOARD_DIMENSION_Y; column++) {
                    System.out.print(gameboard[row][column]);
                }
                System.out.println("");
            }  
            System.out.println("==========================");
            for (int row = 0; row < BOARD_DIMENSION_X; row++) {
                for (int column = 0; column < BOARD_DIMENSION_Y; column++) {
                    if(gameboard[row][column].equals("$")){
                        gameboard[row][column] = "*";
                    }
                }
            }
            gameboard[cordY][cordX] = "$";
            movement = keyboard.nextLine();
            if(movement.equalsIgnoreCase("w")){
                if(cordY > 0){
                    cordY -= 1;
                }
            }
            else if(movement.equalsIgnoreCase("a")){
                if(cordX > 0){
                    cordX -= 1;
                }
            }
            else if(movement.equalsIgnoreCase("s")){
                if(cordY < BOARD_DIMENSION_Y - 1){
                    cordY += 1;
                }
            
            }
            else if(movement.equalsIgnoreCase("d")){
                if(cordX < BOARD_DIMENSION_X-1){
                    cordX += 1;
                }
            }
            gameboard[cordY][cordX] = "N";
            keyboard.close();
        }
    }
}