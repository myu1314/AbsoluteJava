import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sixPP17 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        int storageOfInts[][] = new int[4][5];
        int numberOfReviews = 0;
        int numberToCheck;
        String line;
        String deliminters = ",";

        try {
            fileIn = new Scanner(new FileInputStream("Ch06\\rsc\\ch6_PP17.csv"));
            fileIn.nextLine();
            while (fileIn.hasNextLine()) {
                numberOfReviews += 1;
                fileIn.nextLine();
            }
            double productAverage[] = new double[5];
            double productNOR[] = new double[5];
            double productTotal[] = new double[5];

            for (int i = 0; i < 5; i++) {
                productAverage[i] = 0;
                productNOR[i] = 0;
                productTotal[i] = 0;
            }

            fileIn = new Scanner(new FileInputStream("Ch06\\rsc\\ch6_PP17.csv"));

            fileIn.nextLine();
            for (int i = 1; i < 4; i++) {
                line = fileIn.nextLine();
                StringTokenizer wordFactory = new StringTokenizer(line, deliminters);
                for (int j = 0; j < 5; j++) {
                    numberToCheck = convertNumber(wordFactory.nextToken());
                    storageOfInts[i][j] = numberToCheck;
                    productTotal[j] += numberToCheck;
                    productNOR[j] += 1;
            
            }
        }
            System.out.print("[");
            for (int i = 0; i < 4; i++) {
                System.out.print(productTotal[i] + ", ");
            }
            System.out.print(productTotal[4]);
            System.out.println("]");
            System.out.print("[");
            for (int i = 0; i < 4; i++) {
                System.out.print(productNOR[i] + ", ");
            }
            System.out.print(productNOR[4]);
            System.out.println("]");


            fileIn.close();
            for (int i = 0; i < 5; i++) {
                productAverage[i] = productTotal[i] / productNOR[i];
            }
            System.out.printf("The average for A is %2.2f \n", productAverage[0]);
            System.out.printf("The average for B is %2.2f \n", productAverage[1]);
            System.out.printf("The average for C is %2.2f \n", productAverage[2]);
            System.out.printf("The average for D is %2.2f \n", productAverage[3]);
            System.out.printf("The average for E is %2.2f \n", productAverage[4]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }

    static int convertNumber(String number) {
        int numToReturn = 0;
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