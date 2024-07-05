import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class sixPP11 {
    public static int cordX;
    public static int cordY;
    public static int PLANE_DIMENSION_X = 7;
    public static int PLANE_DIMENSION_Y = 4;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String airplaneSeating[][] = new String[PLANE_DIMENSION_X][PLANE_DIMENSION_Y];
        for (int row = 0; row < PLANE_DIMENSION_X; row++) {
            airplaneSeating[row][0] = "A";
            airplaneSeating[row][1] = "B";
            airplaneSeating[row][2] = "C";
            airplaneSeating[row][3] = "D";
        }

        for (int row = 0; row < PLANE_DIMENSION_X; row++) {
            System.out.print(row + 1 + " ");
            for (int column = 0; column < PLANE_DIMENSION_Y; column++) {
                System.out.print(airplaneSeating[row][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("==========================");
        System.out.println("How many seats would you like to book?");
        int seatsToBook;
        int seatX;
        String seatY;
        int seatYCount = 0;
        seatsToBook = keyboard.nextInt();
        for(int seatsLeftForBooking = 0; seatsLeftForBooking < seatsToBook; seatsLeftForBooking++){
            System.out.println("Seat X:");
            seatX = keyboard.nextInt();
            System.out.println("Seat Y:");
            keyboard.nextLine();
            seatY = keyboard.nextLine();
            if(seatY.equalsIgnoreCase("A")){
                seatYCount = 1;
            }
            else if(seatY.equalsIgnoreCase("B")){
                seatYCount = 2;
            }
            else if(seatY.equalsIgnoreCase("C")){
                seatYCount = 3;
            }
            else if(seatY.equalsIgnoreCase("D")){
                seatYCount = 4;
            }
            airplaneSeating[seatX-1][seatYCount-1] = "X";
        }
        System.out.println("Booked Spots:");
        for (int row = 0; row < PLANE_DIMENSION_X; row++) {
            System.out.print(row + 1 + " ");
            for (int column = 0; column < PLANE_DIMENSION_Y; column++) {
                System.out.print(airplaneSeating[row][column] + " ");
            }
            System.out.println("");
        }
    }
}