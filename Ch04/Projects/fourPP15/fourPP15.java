import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class fourPP15 {
    public static void main(String[] args) throws Exception {
        //Main Variable Definition
        Scanner keyboard = new Scanner(System.in);
        Scanner fileIn = null;
        double product1Num = 0;
        double product2Num = 0;
        double product3Num = 0;
        double product4Num = 0;
        double numberOfReviews = 0;
        double finalRating = 0;
        int checkingMin = 0;
        double min = 100;
        double numberToCheck;
        String line;
        String deliminters = ",";
        String input = "";
        
        //Collecting Input
        System.out.println("Please input the ratings for the first 4 products, seperated by commas.");
        System.out.println("I will attempt to predict the ratings for the final one:");
        input = keyboard.nextLine();
        StringTokenizer inputReader = new StringTokenizer(input, deliminters);

        double c1r = convertNumber(inputReader.nextToken());
        double c2r = convertNumber(inputReader.nextToken());
        double c3r = convertNumber(inputReader.nextToken());
        double c4r = convertNumber(inputReader.nextToken());
        //Reading File
        try {
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP15.csv"));
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
                //Seperating Each Line
                numberToCheck = convertNumber(wordFactory.nextToken());
                product1Num = numberToCheck;
                //Seperating Each Line      
                numberToCheck = convertNumber(wordFactory.nextToken());
                product2Num = numberToCheck;
                //Seperating Each Line
                numberToCheck = convertNumber(wordFactory.nextToken());
                product3Num = numberToCheck;
                //Seperating Each Line
                numberToCheck = convertNumber(wordFactory.nextToken());
                product4Num = numberToCheck;
                //Seperating Each Line
                double checker=  returnAverage(product1Num, product2Num, product3Num,product4Num, c1r, c2r, c3r, c4r);
               
                double holding = convertNumber(wordFactory.nextToken());
                if  (checker < min){
                    min = numberToCheck;
                    finalRating = holding;
                    
                }
                
            }
            System.out.println("Is your final rating? " + finalRating);
            

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
    static double returnAverage(double r1,double r2,double r3,double r4,double c1r,double c2r,double c3r,double c4r){
        double similiarty = Math.abs(r1 - c1r) + Math.abs(r2 - c2r) + Math.abs(r3 - c3r) + Math.abs(r4 - c4r);
        
        return similiarty;

    }
}