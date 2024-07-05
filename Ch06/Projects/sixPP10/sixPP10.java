import java.util.Scanner;
import java.util.Random;

public class sixPP10 {
    public static void main(String[] args){
        Random random = new Random();
        int cordX = random.nextInt(5)-1;
        int cordY = random.nextInt(5)-1;

        String gameboard[][] = new String[5][5];
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                gameboard[row][column] = "*";
            }
        }
        gameboard[cordY][cordX] = "N";
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.println(gameboard[row][column]);
            }
        }


        System.out.println("Movement");
    }
}