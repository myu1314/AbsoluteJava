import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class fourPP14 {
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        double product1Average = 0;
        double product2Average = 0;
        double product3Average = 0;
        double product4Average = 0;
        double product5Average = 0;
        double product1NOR = 0;
        double product2NOR = 0;
        double product3NOR = 0;
        double product4NOR = 0;
        double product5NOR = 0;
        double numberOfReviews = 0;
        double numberToCheck;
        String line;
        String deliminters = ",";

        try {
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP14.csv"));
            fileIn.nextLine();
            while (fileIn.hasNextLine()) {
                numberOfReviews += 1;
                fileIn.nextLine();

            }

            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP15.csv"));
            line = fileIn.nextLine();
            StringTokenizer wordFactory = new StringTokenizer(line, deliminters);
            
            for (int i = 0; i < numberOfReviews; i++) {
                line = fileIn.nextLine();
                wordFactory = new StringTokenizer(line, deliminters);
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0) {
                    product1NOR += 1;
                }
                product1Average += numberToCheck;

                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0) {
                    product2NOR += 1;
                }
                product2Average += numberToCheck;

                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0) {
                    product3NOR += 1;
                }
                product3Average += numberToCheck;

                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0) {
                    product4NOR += 1;
                }
                product4Average += numberToCheck;

                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0) {
                    product5NOR += 1;
                }
                product5Average += numberToCheck;

                

            }
            product1Average = product1Average / product1NOR;
            product2Average = product2Average / product2NOR;
            product3Average = product3Average / product3NOR;
            product4Average = product4Average / product4NOR;
            product5Average = product5Average / product5NOR;
            System.out.println("The average for A is " + product1Average);
            System.out.println("The average for B is " + product2Average);
            System.out.println("The average for C is " + product3Average);
            System.out.println("The average for D is " + product4Average);
            System.out.println("The average for E is " + product5Average);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }

    static double convertNumber(String number) {
        double numToReturn = 0;
        if (number.equals("1")) {
            numToReturn = 1;
        } else if (number.equals("2")) {
            numToReturn = 2;
        } else if (number.equals("3")) {
            numToReturn = 3;
        } else if (number.equals("4")) {
            numToReturn = 4;
        } else if (number.equals("5")) {
            numToReturn = 5;
        } else if (number.equals("0")) {
            numToReturn = 0;
        } else {
            numToReturn = -1;
        }
        return numToReturn;
    }
}